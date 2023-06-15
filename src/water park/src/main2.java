
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, welcome to the water park!");

        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            customers.add(new Customer(name, age, height));
            System.out.println();
        }

        System.out.println("Customer Information:");
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerInformation());
        }

        WaterSlide slide1 = new WaterSlide("Slide 1", 10, 5);
        WaterSlide slide2 = new WaterSlide("Slide 2", 3, 2);

        for (Customer customer : customers) {

            try {
                if (slide1.isAllowed(customer)) {
                    System.out.println("➜ " + customer.getName() + " can access " + slide1.getName());
                }
            } catch (AccessDeniedException e) {
                System.out.println(
                        "➜ " + customer.getName() + " cannot access " + slide1.getName() + ": " + e.getMessage());
            }

            try {
                if (slide2.isAllowed(customer)) {
                    System.out.println("➜ " + customer.getName() + " can access " + slide2.getName());
                }
            } catch (AccessDeniedException e) {
                System.out.println(
                        "➜ " + customer.getName() + " cannot access " + slide2.getName() + ": " + e.getMessage());
            }

            System.out.println();
        }
    }
}

class Customer {
    private String name;
    private int age;
    private double height;

    public Customer(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getCustomerInformation() {
        return "Name: " + name + ", Age: " + age + ", Height: " + height;
    }
}

class WaterSlide {
    private String name;
    private int minAge;
    private double minHeight;

    public WaterSlide(String name, int minAge, double minHeight) {
        this.name = name;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public boolean isAllowed(Customer customer) throws AccessDeniedException {
        if (customer.getAge() >= minAge && customer.getHeight() >= minHeight) {
            return true;
        } else {
            throw new AccessDeniedException("Access denied for " + customer.getName());
        }
    }
}

class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}