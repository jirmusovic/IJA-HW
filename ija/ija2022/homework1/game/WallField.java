package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;
import ija.ija2022.homework1.common.MazeObject;

public class WallField implements Field {

    private Maze maze;
    private MazeObject mazeObject;
    private int rows;
    private int cols;

    public WallField(int cols, int rows){
        this.mazeObject = null;
        this.maze = null;
        this.cols = cols;
        this.rows = rows;
    }

    public void setMaze(Maze maze) {
        this.maze = maze;
    }

    @Override
    public boolean remove(MazeObject object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean put(MazeObject object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public MazeObject get() {
        return this.mazeObject;
    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public Field nextField(Field.Direction dirs) {
        throw new UnsupportedOperationException();
    }
}
