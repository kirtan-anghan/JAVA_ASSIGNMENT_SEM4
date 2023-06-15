//make water park management system in side this system we have kids and adults portion for each water_slide
// we have some specific function for some only kids can assess and some functionality are only adult can access
// in the water slide we have also height restriction for each water slide also use exception handling

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi , welcome to water park");

        System.out.println("how many number of people are you ..?");
        int n = sc.nextInt();
        customer_name[] customer = new customer_name[n];

        int i = 0;
        while (i < n) {
            System.out.println("enter details for " + (i + 1) + " person");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            int height = sc.nextInt();
            customer[i] = new customer_name(name, age, height);
            i++;
            System.out.println(" ");
        }
    }
}

class customer_name {
    String name = "";
    int age = 0;
    int height = 0;

    customer_name(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getcustomer_information() {
        return "customer name is " + this.name + ". it's age is " + this.age + "." + "it's height is " + this.height;
    }

}

class water_slide1 extends customer_name {
    super(name,age,height);

    water_slide1() {
        try {
            if (this.height < 5) {
                throw new Exception("height is less than 5");

            } else if (this.age < 10) {
                throw new Exception("age is less than 10");
            } else {
                System.out.println("you can access this water slide");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class water_slide2 extends customer_name {
    super(name,age,height);

    water_slide2() {
        try {
            if (this.height < 2) {
                throw new Exception("height is less than 2");

            } else if (this.age < 3) {
                throw new Exception("age is less than 3");
            } else {
                System.out.println("you can access this water slide");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
