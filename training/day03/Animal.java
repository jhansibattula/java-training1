package com.trimindtech.training.day03;

public class Animal {

    private String colour;

    public Animal(String colour, String name, boolean cornivorus, int leavingspan) {
        this.colour = colour;
        this.name = name;
        this.cornivorus = cornivorus;
        this.leavingspan = leavingspan;
    }

    private String name;
    private boolean cornivorus;
    private int leavingspan;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCornivorus() {
        return cornivorus;
    }

    public void setCornivorus(boolean cornivorus) {
        this.cornivorus = cornivorus;
    }

    public int getLeavingspan() {
        return leavingspan;
    }

    public void setLeavingspan(int leavingspan) {
        this.leavingspan = leavingspan;
    }
}
