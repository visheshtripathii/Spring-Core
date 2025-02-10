package com.springcore.autowiring.constructor;

public class Game {
    private String gameName;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        System.out.println("Setter Game");
        this.gameName = gameName;
    }

    public Game() {
    }

    public Game(String gameName) {
        System.out.println("Constructor Game");
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                '}';
    }
}
