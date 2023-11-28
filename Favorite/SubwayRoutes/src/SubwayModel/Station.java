package SubwayModel;

public class Station {
    private final String name;
    private final int line;
    private boolean isInterconnection;
    private int interconnectedLineNumber;

    public Station(String name, int line, boolean isInterconnection, int interconnectedLineNumber) {
        this.name = name;
        this.line = line;
        this.isInterconnection = isInterconnection;
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
}
