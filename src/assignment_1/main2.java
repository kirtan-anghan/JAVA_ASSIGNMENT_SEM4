package assignment_1;

import java.util.Scanner;

//•	Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the numbers, display the numbers
public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
        System.out.println("The reversed numbers are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void reverse(int[] numbers) {
        int temp;
        for (int i = 0; i < 5; i++) {
            temp = numbers[i];
            numbers[i] = numbers[9 - i];
            numbers[9 - i] = temp;
        }
    }

}
