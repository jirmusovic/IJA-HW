package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;

public class MazeConfigure implements Maze {
    private int cols;
    private int rows;
    private int line;
    private Field[][] doubleField;
    public MazeConfigure(){}


    public boolean stopReading(){
        return this.rows == this.line+1;
    }

    public void startReading(int rows, int cols) {
        line = 1;
        this.cols = cols + 2;
        this.rows = rows + 2;
        this.doubleField = new Field[this.rows][this.cols];
        for(int i = 0; i < this.rows; i++){
            this.doubleField[i][0] = new WallField(i, 0);
            this.doubleField[i][this.cols - 1] = new WallField(i, this.cols - 1);
            this.doubleField[i][0].setMaze(this);
            this.doubleField[i][this.cols - 1].setMaze(this);
        }
        for(int i = 1; i < this.cols - 1; i++){
            this.doubleField[0][i] = new WallField(0, i);
            this.doubleField[this.rows - 1][i] = new WallField(this.rows - 1, i);
            this.doubleField[0][i].setMaze(this);
            this.doubleField[this.rows - 1][i].setMaze(this);
        }
    }

    public boolean processLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case 'X':
                    this.doubleField[this.line][i + 1] = new WallField(this.line, i + 1);
                    this.doubleField[this.line][i + 1].setMaze(this);
                    break;
                case '.':
                    this.doubleField[this.line][i + 1] = new PathField(this.line, i + 1);
                    this.doubleField[this.line][i + 1].setMaze(this);
                    break;
                case 'S':
                    this.doubleField[this.line][i + 1] = new PathField(this.line, i + 1);
                    this.doubleField[this.line][i + 1].put(new PacmanObject(this.doubleField[this.line][i + 1]));
                    this.doubleField[this.line][i + 1].setMaze(this);
                    break;
            }
        }
        this.line++;
        return true;
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

    public Maze createMaze() {
        if(this.rows == this.line+1){
            return this;
        }
        return null;
    }
}
