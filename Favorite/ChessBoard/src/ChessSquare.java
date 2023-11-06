public class ChessSquare {
    private final int rank;
    private final int file;
    public final String coordinate;

    public ChessSquare(String coordinate) {
        this.coordinate = coordinate;
        this.file = ChessBoard.getIndex(ChessBoard.files, coordinate.charAt(0));
        this.rank = ChessBoard.getIndex(ChessBoard.ranks, coordinate.charAt(1));
    }

    public String getColor() {
        String color = ChessBoard.getColor(getFile() + getRank()) == ' ' ? "White" : "Black";
        return coordinate + " is " + color;
    }

    public String getRank() {
        return ChessBoard.ranks[rank];
    }

    public String getFile() {
        return ChessBoard.files[file];
    }
}
