package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;

public class PacmanMaze implements Maze {

    private Field[][] doubleField;
    private int cols;
    private int rows;

    public PacmanMaze(int rows, int cols) {}

    public static Maze create(int rows, int cols, Field[][] board) {
        return null;
    }

    @Override
    public int numCols() {
        return cols;
    }

    @Override
    public int numRows() {
        return rows;
    }

    @Override
    public Field getField(int row, int col) {
        return this.doubleField[row][col];
    }
}
