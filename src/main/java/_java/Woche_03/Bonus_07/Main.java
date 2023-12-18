package _java.Woche_03.Bonus_07;

import java.util.Random;
import java.util.Scanner;

public class Main {


    //coded by Time_ON aka the MasterBaiter
    private static int[][] generateRandomSudoku() {
        Random random = new Random();

        int randomNumber;
        int[][] randomSudoku = new int[9][9];

        do {
            randomNumber = random.nextInt(9 - 1 + 1) + 1;

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (isValid(randomSudoku, i, j, randomNumber)) {
                        randomSudoku[i][j] = randomNumber;
                    }

                }
            }
        } while (!solveSudoku(randomSudoku));
        return randomSudoku;
    }

    private static int[][] sudokuDifficulty(int[][] randomSudoku, double actualDifficulty, int difficulty) {
        Random random = new Random();


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (random.nextDouble() > actualDifficulty) {
                    randomSudoku[i][j] = 0;
                }
                if (!checkBoxForZero(randomSudoku, i, j, difficulty)) {
                    randomSudoku[(random.nextInt(8 - 1 + 1) + 1)][(random.nextInt(8 - 1 + 1) + 1)] = 0;
                }
            }
        }
        return randomSudoku;
    }

    private static boolean checkBoxForZero(int[][] sudokuBoard, int rowV, int rowH, int difficulty) {
        int detectedZero = 0;

        int boxV = rowV - rowV % 3;
        int boxH = rowH - rowH % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudokuBoard[i + boxV][j + boxH] == 0) {
                    detectedZero++;
                }
            }
        }
        return switch (difficulty) {
            case 1 -> {
                if (detectedZero > 2) {
                    yield true;
                }
                yield false;
            }
            case 2 -> {
                if (detectedZero > 4) {
                    yield true;
                }
                yield false;
            }
            case 3 -> {
                if (detectedZero > 6) {
                    yield true;
                }
                yield false;
            }
            default -> true;
        };
    }

    private static void printSudoku(int[][] sudokuBoard) {
        for (int[] ints : sudokuBoard) {
            for (int rowH = 0; rowH < sudokuBoard.length; rowH++) {
                System.out.print(" " + ints[rowH] + " ");
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
        return checkRowV(sudokuBoard, rowH, num) && checkRowH(sudokuBoard, rowV, num) && checkBox(sudokuBoard, rowV, rowH, num);
    }

    private static boolean checkRowV(int[][] sudokuBoard, int rowH, int num) {
        for (int rowV = 0; rowV <= 8; rowV++) {
            if (sudokuBoard[rowV][rowH] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkRowH(int[][] sudokuBoard, int rowV, int num) {
        for (int rowH = 0; rowH <= 8; rowH++) {
            if (sudokuBoard[rowV][rowH] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkBox(int[][] sudokuBoard, int rowV, int rowH, int num) {
        int boxV = rowV - rowV % 3;
        int boxH = rowH - rowH % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudokuBoard[i + boxV][j + boxH] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] sudoku;
        int difficulty;
        double actualDifficulty = 0;

        while (true) {
            System.out.println("Select difficulty 1-3");
            difficulty = sc.nextInt();
            if (difficulty > 0 && difficulty < 4) {
                break;
            } else {
                System.out.println("Inavlid difficulty");
            }
        }

        switch (difficulty) {
            case 1:
                actualDifficulty = 0.5;
                break;
            case 2:
                actualDifficulty = 0.3;
                break;
            case 3:
                actualDifficulty = 0.2;
                break;
        }

        sudoku = generateRandomSudoku();
        sudoku = sudokuDifficulty(sudoku, actualDifficulty, difficulty);

        printSudoku(sudoku);
    }
}
