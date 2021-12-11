package com.misiontic_hackaton.game_ms.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Adventure {

    @Id
    private String  name;
    private String description;
    private List<Item> items;

    public Adventure() {
    }

    public Adventure(String name, String description, List<Item> items) {
        this.name = name;
        this.description = description;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
