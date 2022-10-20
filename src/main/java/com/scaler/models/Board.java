package com.scaler.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new ArrayList<>(); //[ [(), (), ()], [], []]

        for (int i = 0; i < dimension; ++i) {
            this.board.add(new ArrayList<>()); //[]

            for (int j = 0; j < dimension; ++j) {
                this.board.get(i).add(new Cell());
            }
        }
    }

    public int getDimension() {
        return dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }


}


// 1. Make classes with private attributes
// 2. Create getters and setters for those
// 3. Always create a constructor that initializes those attributes
