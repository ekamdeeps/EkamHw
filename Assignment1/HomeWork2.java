package Assignment1;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Factorial");
        int x = sc.nextInt();

        int fact=1;
        while(x>=1)
        {
            fact=fact*x;
            x--;
        }
        System.out.println(fact);
    }
}
