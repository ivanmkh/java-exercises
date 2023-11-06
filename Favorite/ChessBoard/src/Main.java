public class Main {
    public static void main(String[] args) {
        System.out.println(ChessBoard.print());

        ChessSquare square1 = new ChessSquare("F6");
        ChessSquare square2 = new ChessSquare("C2");

        String comparationResult = ChessBoard.getColor(square1.coordinate) == ChessBoard.getColor(square2.coordinate) ?
                "equals" : "different";

        System.out.println(square1.getColor());
        System.out.println(square2.getColor());
        System.out.printf("Colors are %s.", comparationResult);
    }
}