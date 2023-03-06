package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;
import ija.ija2022.homework1.common.MazeObject;

import java.util.Objects;

public class PathField implements Field {
    private Maze maze;
    private MazeObject mazeObject;
    private int rows;
    private int cols;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof  PathField == false) return false;
        PathField pathField = (PathField) o;
        return rows == pathField.rows && cols == pathField.cols;
    }


    public PathField(int rows, int cols){
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
        if(mazeObject != object ) return false;
        this.mazeObject = null;
        return true;
    }

    @Override
    public boolean put(MazeObject object) {
        if (isEmpty()) {
            this.mazeObject = object;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.mazeObject == null;
    }

    @Override
    public MazeObject get() {
        return this.mazeObject;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public Field nextField(Field.Direction dirs) {
        switch(dirs) {
            case L:
                return maze.getField(rows, cols - 1);
            case R:
                return maze.getField(rows, cols + 1);
            case U:
                return maze.getField(rows + 1, cols);
            case D:
                return maze.getField(rows - 1, cols);
            default:
                return null;
        }
    }
}
