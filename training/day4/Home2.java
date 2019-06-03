package com.trimindtech.training.day4;

public class Home2 {


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Home2(String type, double price, int bedrooms) {
        this.type = type;
        this.price = price;
        this.bedrooms = bedrooms;
    }

    public Home2() {
    }

    public Home2(String type, char zone, double price, int bedrooms) {
        this.type = type;
        this.zone = zone;
        this.price = price;
        this.bedrooms = bedrooms;
    }
    public  String type;
    public  char zone;
    public double price;

    @Override
    public String toString() {
        return "Home2{" +
                "type='" + type + '\'' +
                ", zone=" + zone +
                ", price=" + price +
                ", bedrooms=" + bedrooms +
                '}';
    }

    public int bedrooms;

}
