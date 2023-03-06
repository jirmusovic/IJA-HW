package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;
import ija.ija2022.homework1.common.MazeObject;

import java.util.Objects;

public class WallField implements Field {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof  WallField == false) return false;
        WallField wallField = (WallField) o;
        return rows == wallField.rows && cols == wallField.cols;
    }


    private Maze maze;
    private MazeObject mazeObject;
    private int rows;
    private int cols;

    public WallField(int rows, int cols){
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
        return true;
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
