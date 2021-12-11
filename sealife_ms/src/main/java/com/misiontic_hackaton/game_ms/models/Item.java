package com.misiontic_hackaton.game_ms.models;

import org.springframework.data.annotation.Id;

public class Item {


    @Id
    private String  name;
    private int type;
    private String description;
    private int score;



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Item() {
    }

    public Item(String name, int type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }
}
