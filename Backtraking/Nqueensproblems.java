public class Nqueensproblems {
    static int count = 0;
    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '*';
            }
        }

        nQueens(board, 0);
        System.out.println("Solutions:" + count);
    }

    public static void nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            // System.out.println("count "+ count);
            return;
        }

        // Main logic
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';

                nQueens(board, row + 1);

                // Backtrack
                board[row][j] = '*';
            }
        }
    }

    // Print the board
    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public int count = 0;
    public static boolean isSafe(char board[][], int row, int col) {
        // Column check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Left diagonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
