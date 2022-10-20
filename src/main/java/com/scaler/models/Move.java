package com.scaler.models;

import java.nio.file.ClosedWatchServiceException;

public class Move {
    private Cell cell;

    public Move(Cell cell, Player player) {
        this.cell = cell;
        this.cell.setPlayer(player);
    }

    public Cell getCell() {
        return cell;
    }


    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
