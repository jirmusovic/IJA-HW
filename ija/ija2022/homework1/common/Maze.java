package ija.ija2022.homework1.common;

public interface Maze {
    public int numCols();

    public int numRows();

    public Field getField(int row, int col);
}
