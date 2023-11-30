package Assignment1;

import java.util.Scanner;

public class HomeWork12 {


   public static int factorial(int x)

   {
       int fact=1;
       while(x>=1)
       {
           fact=fact*x;
           x--;
       }
      return(fact);

   }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number for Factorial");
            int x = sc.nextInt();
            System.out.println(factorial(x));
        }
    }

