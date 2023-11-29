package SubwayModel;

public class Station {
    private final String name;
    private final int line;
    private boolean isInterconnection;
    private String interconnectedStationName;
    private int interconnectedLineNumber;

    public Station(String name, int line, boolean isInterconnection, String interconnectedStationName, int interconnectedLineNumber) {
        this.name = name;
        this.line = line;
        this.isInterconnection = isInterconnection;
        this.interconnectedStationName = interconnectedStationName;
        this.interconnectedLineNumber = interconnectedLineNumber;
    }

    public String getName() {
        return name;
    }

    public int getLine() {
        return line;
    }

    public boolean isInterconnection() {
        return isInterconnection;
    }

    public int getInterconnectedLineNumber() {
        return interconnectedLineNumber;
    }

    public String getInterconnectedStationName() {
        return interconnectedStationName;
    }

    @Override
    public String toString() {
        return getName();
    }
}
