package SubwayModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Subway {
    private ArrayList<Line> lines;
    private final double INTERCONNECTION_STATION_DURATION = 1.75;
    private final double STATION_DURATION = 2.5;
    public Subway() {
        this.lines = new ArrayList<>();
        generateSubway();
    }

    private void generateSubway() {
        Line line1 = new Line(1);
        line1.add(new Station("A", 1, false, "", -1));
        line1.add(new Station("B", 1, false, "", -1));
        line1.add(new Station("C1", 1, true, "C2", 2));
        line1.add(new Station("D", 1, false, "", -1));
        line1.add(new Station("E", 1, false, "", -1));
        this.lines.add(line1);
        Line line2 = new Line(2);
        line2.add(new Station("F", 2, false, "", -1));
        line2.add(new Station("C2", 2, true, "C1", 1));
        line2.add(new Station("G", 2, false, "", -1));
        line2.add(new Station("L2", 2, true, "L3", 3));
        line2.add(new Station("H", 2, false, "", -1));
        this.lines.add(line2);
        Line line3 = new Line(3);
        line3.add(new Station("I", 3, false, "", -1));
        line3.add(new Station("L3", 3, true, "L2", 2));
        line3.add(new Station("J", 3, false, "", -1));
        line3.add(new Station("K", 3, false, "", -1));
        this.lines.add(line3);
    }

    public void printAllStations() {
        lines.forEach(line -> {
            System.out.printf("SubwayModel.Line \"%d\": \n", line.getLineNumber());
            line.printStations();
        });
        ;
    }

    public void findRoute() {
        Station fromStation = null, toStation = null;
        System.out.print("Input departure station: ");
        fromStation = getStationFromUserInput();
        System.out.print("Input destination station: ");
        toStation = getStationFromUserInput();
        List<Station> route = getRoute(fromStation, toStation, new ArrayList<>());
        System.out.println("Route is following: ");
        route.forEach(System.out::println);
        System.out.printf("Travel duration is %.1f minutes\n", getDuration(route));

    }

    private Station getStationFromUserInput() {
        Station station = null;
        String stationName = null;
        while (Objects.isNull(station)) {
            stationName = new Scanner(System.in).nextLine();
            station = getStationByName(stationName);
            if (Objects.isNull(station)) {
                System.out.print("There is no such station! Please retry again: ");
            }
        }
        return station;
    }

    private Station getStationByName(String stationName) {
        Station station = null;
        for (int i = 0; i < lines.size(); i++) {
            int index = lines.get(i).getStationIndex(stationName);
            if (index != -1) {
                station = lines.get(i).getStationByIndex(index);
                break;
            }
        }
        return station;
    }

    private List<Station> getRoute(Station fromStation, Station toStation, List<Station> previousRoute) {
        List<Station> route = new ArrayList<>();
        List<List<Station>> subRoutes = new ArrayList<>();
        List<Station> interconnectedStations = new ArrayList<>();
        if (fromStation.getLine() == toStation.getLine()) {
            route.addAll(moveToStationInLine(fromStation, toStation));
        } else {
            interconnectedStations = getLineByNumber(fromStation.getLine()).getAllIntercaonnectionStations();
            if (interconnectedStations.contains(fromStation)) {
                interconnectedStations.remove(fromStation);
            }
            for (Station station : previousRoute) {
                if (interconnectedStations.contains(station)) {
                    interconnectedStations.remove(station);
                }
            }
            for (int i = 0; i < interconnectedStations.size(); i++) {
                subRoutes.add(new ArrayList<>());
                subRoutes.get(i).addAll(moveToStationInLine(fromStation, interconnectedStations.get(i)));
                String interconnectedStationName = interconnectedStations.get(i).getInterconnectedStationName();
                Station interconnected = getStationByName(interconnectedStationName);
                List<Station> tempRoute = getRoute(interconnected, toStation, subRoutes.get(i));
                if (tempRoute.get(tempRoute.size() - 1).getName().equals(toStation.getName())) {
                    subRoutes.get(i).addAll(tempRoute);
                }
            }
        }
        if (!subRoutes.isEmpty()) {
            int minRouteIndex = 0;
            for (int i = 0; i<subRoutes.size();i++) {
                if (subRoutes.get(i).size() < subRoutes.get(minRouteIndex).size()){
                    minRouteIndex = i;
                }
            }
            route.addAll(subRoutes.get(minRouteIndex));
        }
        return route;
    }

    private List<Station> moveToStationInLine(Station fromStation, Station toStation) {
        List<Station> route = new ArrayList<>();
        if (fromStation.getLine() != toStation.getLine()) {
            return null;
        }
        int lineNumber = fromStation.getLine();
        Line line = getLineByNumber(lineNumber);
        int fromIndex = line.getStationIndex(fromStation.getName());
        int toIndex = line.getStationIndex(toStation.getName());
        if (fromIndex <= toIndex) {
            for (int i = fromIndex; i <= toIndex; i++) {
                route.add(line.getStationByIndex(i));
            }
        } else {
            for (int i = fromIndex; i >= toIndex; i--) {
                route.add(line.getStationByIndex(i));
            }
        }
        return route;
    }

    private Line getLineByNumber(int lineNumber) {
        return lines.stream()
                .filter(line -> line.getLineNumber() == lineNumber)
                .findAny()
                .orElse(null);
    }

    private double getDuration(List<Station> route) {
        double duration = 0f;
        route.remove(0);
        for (Station station: route){
            duration += station.isInterconnection()? INTERCONNECTION_STATION_DURATION: STATION_DURATION;
        }
        return duration;
    }

}