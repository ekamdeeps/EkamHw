package Assignment1;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

            System.out.println("Welcome to my calculator");
            System.out.println("1. Press + for addition");
            System.out.println("2. Press - for subtraction");
            System.out.println("3. Press * for multiplication");
            System.out.println("4. Press / for division");
            char ch = sc.next().charAt(0);
            System.out.println("Enter the first number");
            double x = sc.nextDouble();
            System.out.println("Enter the second number");
            double y = sc.nextDouble();

            switch (ch) {

                case '+':
                    System.out.println("The sum of two numbers is: " + (x + y));
                    break;
                case '-':
                    System.out.println("The subtraction of two numbers is: " + (x - y));
                    break;
                case '*':
                    System.out.println("The multiplication of two numbers is: " + (x * y));
                    break;
                case '/':
                    System.out.println("The Division of two numbers is: " + (x / y));
                    break;
                default:
                    System.out.println("Invalid input ");

            }

    }
}
