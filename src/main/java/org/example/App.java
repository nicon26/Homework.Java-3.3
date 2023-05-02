package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App
{
    public static void main( String[] args )
    {
        List<Shape> shapesList = new ArrayList<Shape>();

        Circle circle = new Circle(4);
        shapesList.add(circle);
        Rectangle rectangle = new Rectangle(3, 8);
        shapesList.add(rectangle);
        Circle circle1 = new Circle(9);
        shapesList.add(circle1);

        final ListIterator<Shape> list  = shapesList.listIterator();

        int totalArea = 0;

        while (list.hasNext()) {
            Shape it = list.next();
            System.out.println("Area " + it.getClass().getSimpleName() + ": " + it.getArea());
            totalArea += it.sumOfAreas();
        }

        System.out.println("Total area: " + totalArea);
    }
}
