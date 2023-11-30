package Assignment1;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a whole number");
        int num =sc.nextInt();
        if(num>=0)
        {
            if(num%2==0)
                System.out.println("Even number");
            else
                System.out.println("Odd number");
        }
        else
            System.out.println("Invalid number");



    }
}
