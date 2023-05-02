package org.example;

public class Triangle implements  Shape{
    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((this.base * this.height) / 2);
    }

    @Override
    public double sumOfAreas(){
        return getArea();
    }
}
