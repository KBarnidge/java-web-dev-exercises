package exercises;

import areaofcircle.Circle;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the radius of the circle");
            double radius = input.nextDouble();
            double area = Circle.getArea(radius);

            if (radius <= 0) {
                System.out.println("NOPE");
            } else {

                //double area = radius * radius * PI;
                System.out.println("Area of circle:" + area);
            }
        
    }

}
