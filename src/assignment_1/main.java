package assignment_1;

//•	Write a program that reads a number in meters, converts it to feet, and displays the result using command line argument.
public class main {
    public static void main(String[] args) {
        double meter = Double.parseDouble(args[0]);
        double feet = meter * 3.28084;
        System.out.println(meter + " meter is  " + feet + " feet");
    }
}

