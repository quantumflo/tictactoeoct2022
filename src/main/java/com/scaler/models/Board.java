package com.scaler.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public int getDimension() {
        return dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
