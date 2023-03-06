package ija.ija2022.homework1.common;

public interface MazeObject {
    public boolean canMove(Field.Direction dir);

    public boolean move(Field.Direction dir);

}
