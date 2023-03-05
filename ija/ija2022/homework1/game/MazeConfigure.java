package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;

public class MazeConfigure implements Maze {
    private int cols;
    private int rows;
    public MazeConfigure(){}

    public boolean stopReading(){
        return true;
    }

    public void startReading(int rows, int cols) {
    }

    @Override
    public int numCols() {
        return 0;
    }

    @Override
    public int numRows() {
        return 0;
    }

    @Override
    public Field getField(int row, int col) {
        return null;
    }
}
