package SubwayModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Subway {
    private ArrayList<Line> lines;

    public Subway() {
        this.lines = new ArrayList<>();
        generateSubway();
    }

    private void generateSubway() {
        Line line1 = new Line(1);
        line1.add(new Station("A", 1, false, -1));
        line1.add(new Station("B", 1, false, -1));
        line1.add(new Station("C1", 1, true, 2));
        line1.add(new Station("D", 1, false, -1));
        line1.add(new Station("E", 1, false, -1));
        this.lines.add(line1);
        Line line2 = new Line(2);
        line2.add(new Station("F", 2, false, -1));
        line2.add(new Station("C2", 2, true, 1));
        line2.add(new Station("G", 2, false, -1));
        line2.add(new Station("L2", 2, true, 3));
        line2.add(new Station("H", 2, false, -1));
        this.lines.add(line2);
        Line line3 = new Line(3);
        line3.add(new Station("I", 3, false, -1));
        line3.add(new Station("L3", 3, true, 2));
        line3.add(new Station("J", 3, false, -1));
        line3.add(new Station("K", 3, false, -1));
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
        List<Station> route = getRoute(fromStation, toStation);
        System.out.println("Route is following: ");
        route.forEach(System.out::println);
        System.out.printf("Route travel duration is: %f\n", getDuration(route));

    }

    private Station getStationFromUserInput() {
        Station station = null;
        String stationName = null;
        while (Objects.isNull(station)) {
            stationName = new Scanner(System.in).nextLine();
            station = findStation(stationName);
            if (Objects.isNull(station)) {
                System.out.print("There is no such station! Please retry again: ");
            }
        }
        return station;
    }

    private Station findStation(String stationName) {
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

    private List<Station> getRoute(Station fromStation, Station toStation) {
        // TODO implement this method according to the following steps:
        // TODO 1. the method must be recursive
        // TODO 2. there should be 3 states: not_found, found, continue searching
        // TODO 3. method should consist of 2 main steps
        // TODO     a. InLine search
        // TODO     b. InterConnected lines search
        // TODO         - check interConnection stations and exclude those tah are already
        //              attended and fromStation if it is interConnection station;
        //              - collect all successful results, but add only shortest one.
        // TODO     c. return all stations on the route
        List<Station> route = new ArrayList<>();
        if (fromStation.getLine() == toStation.getLine()) {
            route.addAll(moveToStationInLine(fromStation, toStation));
        } else {

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
        return 0f;
    }

}