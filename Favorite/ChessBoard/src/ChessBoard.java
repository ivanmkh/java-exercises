public class ChessBoard {
    public static final int[][] board = {
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1}
    };

    public static String[] files = {"A", "B", "C", "D", "E", "F", "G", "H"};
    public static String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8"};

    public static char getColor(String coordinate) {
        int file = getIndex(files, coordinate.charAt(0));
        int rank = getIndex(ranks, coordinate.charAt(1));
        return (char) (board[rank][file] == 1 ?
                '█' : ' ');
    }

    public static String print() {
        char ch = ' ';
        StringBuilder sb = new StringBuilder();
        int currentRank = ranks.length - 1;
        for (int i = 0; i < board.length; i++) {
            sb.append(ranks[currentRank--] + " ");
            for (int j = 0; j < board.length; j++) {
                ch = getColor(files[j] + ranks[i]);
                sb.append(ch);
                sb.append(ch);
            }
            sb.append(System.lineSeparator());
        }

        sb.append("  ");
        for (int i = 0; i < files.length; i++) {
            sb.append(files[i] + " ");
        }

        return sb.toString();
    }

    public static int getIndex(String[] array, char value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(String.valueOf(value))) {
                index = i;
            }
        }
        return index;
    }
}
