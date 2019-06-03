package com.trimindtech.training.home4;

public class Bekary {
    private String chocolatemoist;
    private  String strawberry;
    private String blueberry;
    private  String cheesycake;

    public Bekary(String onekg, String twokg, String threekg) {
        this.onekg = onekg;
        this.twokg = twokg;
        this.threekg = threekg;
    }

    @Override
    public String toString() {
        return "Bekary{" +
                "chocolatemoist='" + chocolatemoist + '\'' +
                ", strawberry='" + strawberry + '\'' +
                ", blueberry='" + blueberry + '\'' +
                ", cheesycake='" + cheesycake + '\'' +
                ", onekg='" + onekg + '\'' +
                ", twokg='" + twokg + '\'' +
                ", threekg='" + threekg + '\'' +
                '}';
    }

    public String getChocolatemoist() {
        return chocolatemoist;
    }

    public void setChocolatemoist(String chocolatemoist) {
        this.chocolatemoist = chocolatemoist;
    }

    public String getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(String strawberry) {
        this.strawberry = strawberry;
    }

    public String getBlueberry() {
        return blueberry;
    }

    public void setBlueberry(String blueberry) {
        this.blueberry = blueberry;
    }

    public String getCheesycake() {
        return cheesycake;
    }

    public void setCheesycake(String cheesycake) {
        this.cheesycake = cheesycake;
    }

    public String getOnekg() {
        return onekg;
    }

    public void setOnekg(String onekg) {
        this.onekg = onekg;
    }

    public String getTwokg() {
        return twokg;
    }

    public void setTwokg(String twokg) {
        this.twokg = twokg;
    }

    public String getThreekg() {
        return threekg;
    }

    public void setThreekg(String threekg) {
        this.threekg = threekg;
    }

    private String onekg;
    private String twokg;
    private String threekg;

    public Bekary() {
    }
    public void printthedetails(){
        System.out.println(this.onekg);
        System.out.println(this.twokg);
        System.out.println(this.threekg);
    }


        /*public void pricedetail(){
            double price = +x* +z;
            System.out.println(price);*/

    }

