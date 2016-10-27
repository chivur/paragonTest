package com.example.razvan.paragontest;

/**
 * Created by Razvan on 3/27/2016.
 */
public class Ability {

    private String name;
    private String description;
    private int iconID;

    public Ability(String name,String description,int iconID){
        this.name = name;
        this.description = description;
        this.iconID = iconID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
