package grid;

/**
 * This class represents a grid, which is a two-dimensional array of cells. A
 * grid can be used to represent a game board, such as a chess board, a
 * tic-tac-toe board or a sudoku. Therefore the items in the grid could be
 * numbers, strings or other objects, depending on the game. In a single grid
 * object, all cells should be of the same type.
 *
 * The cells in the grid can be accessed by their rows and columns indices.
 * Some games have a fixed size grid, such as a chess board or a sudoku, but
 * in some scenarios the grid can be dynamic, so that the playing area can grow
 * or shrink as needed. This class should be able to handle dynamic sizes. You
 * might also accept negative rows and columns, although those won't be strictly
 * required.
 *
 * Your task is to implement the storage for the grid as well as getter and
 * setter methods for accessing the cells. Both the getter and setter methods
 * should take both the row and column indices as parameters. Note that the
 * grid may be filled and accessed in any order, so you should not assume that
 * preceding cells have been filled before you access a cell. In case a cell
 * has not been filled, the getter should return null.
 *
 * In this exercise, you can choose the internal data structure for storing the
 * grid freely. You can use arrays, lists, maps or any other data structure that
 * you see fit. You can also create new classes and methods. For example, Map
 * uses a helper class called Entry to store the keys and values as pairs. You
 * could also serialize the rows and columns into a single index (a string
 * perhaps) and use a map to store the values. The choice is yours, as long as
 * the public methods work as expected.
 *
 * @param <Type> Similar to the List or Map classes, this class is generic and
 *               can store any type of objects. The type is defined when a new
 *               object is created, for example new Grid<String>() or new
 *               Grid<Integer>(). Always refer to the stored objects as Type,
 *               not as a specific class such as String or Integer.
 */
public class Grid<Type> {

    /**
     * Creates a new empty grid. The size of the grid is not fixed and the cells can
     * be filled and accessed in any order.
     */
    public Grid() {
        // TODO: consider instantiating your internal data structure here
    }

    public void set(int row, int col, Type value) {
        // TODO: use the row and col to store the given value
    }

    public Type get(int row, int col) {
        // TODO: use the row and col to retrieve the value
        return null;
    }
}
