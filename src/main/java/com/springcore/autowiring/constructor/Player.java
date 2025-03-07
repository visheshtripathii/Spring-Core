package com.springcore.autowiring.constructor;

public class Player {
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        System.out.println("Setter Player");
        this.game = game;
    }

    public Player() {
    }

    public Player(Game game) {
        System.out.println("Constructor Player");
        this.game = game;
    }

    @Override
    public String toString() {
        return "Player{" +
                "game=" + game +
                '}';
    }
}
