package org.example;

public class Square implements Shape{
    private double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double sumOfAreas(){
        return getArea();
    }
}
