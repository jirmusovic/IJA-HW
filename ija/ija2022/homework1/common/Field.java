package ija.ija2022.homework1.common;

public interface Field {
    public static enum Direction {
        L,
        D,
        U,
        R;
    }
    public void setMaze(Maze maze);

    public boolean remove(MazeObject object);

    public boolean put(MazeObject object);

    public boolean isEmpty();

    public MazeObject get();

    public boolean canMove();

    public Field nextField(Field.Direction dirs);
}

