package SubwayModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Line {
    private int lineNumber;
    private ArrayList<Station> stations;

    public Line(int lineNumber) {
        this.lineNumber =  lineNumber;
        this.stations = new ArrayList<>();
    }

    public void add(Station station){
        stations.add(station);
    }

    public int getStationIndex(String stationName) {
        Station searchStation = stations.stream()
                .filter(station -> station.getName().equals(stationName))
                .findAny()
                .orElse(null);
        return stations.indexOf(searchStation);
    }

    public Station getStationByIndex(int index) {
        return stations.get(index);
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public List<Station> getAllIntercaonnectionStations() {
        return stations.stream()
                .filter(Station::isInterconnection)
                .collect(Collectors.toList());
    }

    public void printStations() {
        stations.forEach(station -> System.out.println(station.getName()));
    }
}
