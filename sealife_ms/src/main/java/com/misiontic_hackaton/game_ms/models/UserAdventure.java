package com.misiontic_hackaton.game_ms.models;

import org.springframework.data.annotation.Id;

public class UserAdventure {
    @Id
    private String id;

    private String  login;
    private String  nameAdventure;
    private int scoreAdventure;
    private int statusAdventure;

    public UserAdventure() {
    }

    public UserAdventure(String login, String nameAdventure, int scoreAdventure, int statusAdventure) {
        this.login = login;
        this.nameAdventure = nameAdventure;
        this.scoreAdventure = scoreAdventure;
        this.statusAdventure = statusAdventure;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNameAdventure() {
        return nameAdventure;
    }

    public void setNameAdventure(String nameAdventure) {
        this.nameAdventure = nameAdventure;
    }

    public int getScoreAdventure() {
        return scoreAdventure;
    }

    public void setScoreAdventure(int scoreAdventure) {
        this.scoreAdventure = scoreAdventure;
    }

    public int getStatusAdventure() {
        return statusAdventure;
    }

    public void setStatusAdventure(int statusAdventure) {
        this.statusAdventure = statusAdventure;
    }
}
