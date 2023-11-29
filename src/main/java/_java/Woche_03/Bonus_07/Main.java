package _java.Woche_03.Bonus_07;

public class Main {

    private static void printSudoku(int[][] sudokuBoard) {
        for (int rowV = 0; rowV < sudokuBoard.length; rowV++) {
            for (int rowH = 0; rowH < sudokuBoard.length; rowH++) {
                System.out.print(" " + sudokuBoard[rowV][rowH] + " ");
                if (rowH == 2 || rowH == 5) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    private static boolean solveSudoku(int[][] sudokuBoard) {
        for (int rowV = 0; rowV < sudokuBoard.length; rowV++) {
            for (int rowH = 0; rowH < sudokuBoard.length; rowH++) {
                if (sudokuBoard[rowV][rowH] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(sudokuBoard, rowV, rowH, num)) {
                            sudokuBoard[rowV][rowH] = num;

                            if (solveSudoku(sudokuBoard)) {
                                return true;
                            }
                            sudokuBoard[rowV][rowH] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] sudokuBoard, int rowV, int rowH, int num) {
        return !checkRowV(sudokuBoard, rowH, num) && !checkRowH(sudokuBoard, rowV, num);
    }

    private static boolean checkRowV(int[][] sudokuBoard, int rowH, int num) {
        for (int rowV = 0; rowV <= 8; rowV++) {
            if (sudokuBoard[rowV][rowH] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRowH(int[][] sudokuBoard, int rowV, int num) {
        for (int rowH = 0; rowH <= 8; rowH++) {
            if (sudokuBoard[rowV][rowH] == num) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[][] sudokuBoard = {
                {9, 0, 0, 7, 0, 4, 6, 0, 1},
                {0, 0, 0, 0, 0, 9, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 7},
                {0, 0, 5, 0, 9, 0, 0, 6, 0},
                {0, 0, 0, 4, 0, 7, 0, 0, 0},
                {0, 9, 0, 0, 3, 0, 4, 0, 0},
                {3, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 6, 0, 2, 0, 0, 0, 0, 0},
                {1, 0, 8, 3, 0, 5, 0, 0, 2}
        };

        if (solveSudoku(sudokuBoard)) {
            printSudoku(sudokuBoard);
        } else {
            System.out.println("Sudoku is not solvable");
        }

    }
}
