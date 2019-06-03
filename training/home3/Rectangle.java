
package com.trimindtech.training.home3;

public class Rectangle {
    public Rectangle(double lenghth1,double width1){
        this.lenghth = lenghth1;
        this.width = width1;
    }

        private double lenghth;
        private double width;





 public void propertiesofrectangke() {
        System.out.println(this.lenghth);
        System.out.println(this.width);


    }


public  void Rectanlearea () {
    double area  = lenghth * width;

    System.out.println(area);


}
public void rectanglePeri() {
    double perimetre = 2 * (lenghth + width);
}


}
