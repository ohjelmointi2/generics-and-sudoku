package sudoku;

import java.util.Scanner;

import grid.Grid;

/**
 * This class contains the game loop for a Sudoku game. The game is played in
 * the console by entering the row, column and number to place on the board.
 *
 * The game logic itself is implemented in the Sudoku class, and the Grid class
 * is used to store the numbers on the board. This exercise is a good example of
 * how you can separate the game logic, the data storage and the user interface
 * into separate classes.
 *
 * Separating the concerns like this makes the code more modular and easier to
 * maintain and test. We could reuse the Grid class for other games that require
 * a two-dimensional grid, and the Sudoku class could be used with a different
 * types of user interfaces, such as a graphical user interface or a web
 * interface.
 */
public class SudokuGame {

    public static void main(String[] args) {
        /*
         * This logo was created using the ANSI Shadow font at
         * https://patorjk.com/software/taag/
         */
        System.out.println("""
                ███████╗██╗   ██╗██████╗  ██████╗ ██╗  ██╗██╗   ██╗
                ██╔════╝██║   ██║██╔══██╗██╔═══██╗██║ ██╔╝██║   ██║
                ███████╗██║   ██║██║  ██║██║   ██║█████╔╝ ██║   ██║
                ╚════██║██║   ██║██║  ██║██║   ██║██╔═██╗ ██║   ██║
                ███████║╚██████╔╝██████╔╝╚██████╔╝██║  ██╗╚██████╔╝
                ╚══════╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝
                """);

        System.out.println("Welcome to the Sudoku game! Press Ctrl + C to exit.\n");

        // we use the private helper method to create a new partially filled Sudoku game
        Sudoku sudoku = new Sudoku(makeStartingGrid());

        gameLoop(sudoku);
    }

    private static void gameLoop(Sudoku sudoku) {
        Scanner scanner = new Scanner(System.in);

        while (!sudoku.isSolved()) {
            System.out.println(sudoku);

            System.out.print("Enter the row (0-8): ");
            int row = scanner.nextInt();

            System.out.print("Enter the column (0-8): ");
            int col = scanner.nextInt();

            System.out.print("Enter the number (1-9): ");
            int number = scanner.nextInt();

            try {
                sudoku.setNumber(row, col, number);
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid move! Please try again.");
            }

            System.out.println(); // Empty line for better readability
        }

        System.out.println("Congratulations! You completed the sudoku!");
        scanner.close();
    }

    /**
     * To start a new game, we need some initial numbers on the board. This method
     * creates a new grid with some numbers filled in. The numbers are from a
     * partially solved Sudoku puzzle borrowed from the mooc course exercises at
     * https://ohjelmointi-24.mooc.fi/
     */
    private static Grid<Integer> makeStartingGrid() {

        int[][] board = {
                { 2, 6, 7, 8, 3, 9, 5, 0, 4 },
                { 9, 0, 3, 5, 1, 0, 6, 0, 0 },
                { 0, 5, 1, 6, 0, 0, 8, 3, 9 },
                { 5, 1, 9, 0, 4, 6, 3, 2, 8 },
                { 8, 0, 2, 1, 0, 5, 7, 0, 6 },
                { 6, 7, 4, 3, 2, 0, 0, 0, 5 },
                { 0, 0, 0, 4, 5, 7, 2, 6, 3 },
                { 3, 2, 0, 0, 8, 0, 0, 5, 7 },
                { 7, 4, 5, 0, 0, 3, 9, 0, 1 }
        };

        Grid<Integer> grid = new Grid<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != 0) {
                    grid.set(row, col, board[row][col]);
                }
            }
        }

        return grid;
    }
}
