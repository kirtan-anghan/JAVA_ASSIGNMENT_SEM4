package assignment_2;
//•	Write a program to implement an Abstract class Shape which contains Abstract method Area().
// Create two other classes Circle and Square which overrides the method Area() and find the area of rectangle and square in respective classes.
// Write demo class

import java.text.DecimalFormat;

class shape{
    public double area() {
        return 0;
    }
}

class circle extends shape{
    DecimalFormat df = new DecimalFormat("0.00");

     private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Double.parseDouble(df.format(Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public String toString() {
        return   "area of radius " + radius + " is " + area() + " ";
    }
}

class Square extends shape {
    DecimalFormat df = new DecimalFormat("0.00");
    private double side;

    public Square(double side){
        this.side = side ;
    }

    @Override
    public double area(){
        return Double.parseDouble(df.format( Math.pow(side, 2)));
    }

    @Override
    public String toString() {
        return "area of side " + side + " is " + area() + " ";
    }
}


public class main4 {
    public static void main(String[] args) {


        shape shape1 = new circle(2);
        shape Square  = new Square(2);

        System.out.println(shape1);
        System.out.println(Square);
    }

}
