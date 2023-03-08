package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.MazeObject;

public class PacmanObject  implements MazeObject {
    private Field field;
    public PacmanObject(Field field){
        this.field = field;
    }

    public boolean canMove(Field.Direction dir) {
        Field moving = field.nextField(dir);
        return moving.canMove();
    }

    public boolean move(Field.Direction dir) {
        if(canMove(dir)){
            this.field.remove(this);
            this.field = this.field.nextField(dir);
            this.field.put(this);
            return true;
        }
        return false;
    }
}
