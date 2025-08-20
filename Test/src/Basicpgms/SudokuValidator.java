package Basicpgms;

public class SudokuValidator {
    public static boolean isValid(int[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[10];
            boolean[] col = new boolean[10];
            boolean[] box = new boolean[10];
            for (int j = 0; j < 9; j++) {
                // Row check
                if (board[i][j] != 0) {
                    if (row[board[i][j]]) return false;
                    row[board[i][j]] = true;
                }
                // Column check
                if (board[j][i] != 0) {
                    if (col[board[j][i]]) return false;
                    col[board[j][i]] = true;
                }
                // Box check
                int r = 3*(i/3) + j/3;
                int c = 3*(i%3) + j%3;
                if (board[r][c] != 0) {
                    if (box[board[r][c]]) return false;
                    box[board[r][c]] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = new int[9][9]; // Empty valid sudoku
        System.out.println(isValid(sudoku) ? "Valid" : "Invalid");
    }
}