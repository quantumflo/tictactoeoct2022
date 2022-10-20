package com.scaler.factories;

import com.scaler.models.Game;
import com.scaler.models.GameWinningStrategyName;
import com.scaler.strategies.winningstrategy.GameWinningStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy
    getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName) {
        return switch (gameWinningStrategyName) {
            case COLUMN -> null;
            case ROW -> null;
            case DIAGONAL -> null;
            case CORNER -> null;
        };
    }

}
