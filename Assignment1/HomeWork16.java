package Assignment1;

import java.util.Scanner;

public class HomeWork16 {


    public static int findMax(int a, int b)

    {

        if(a>b)
            return a;
        else
            return b;

    }

    public static int findMax(int a, int b, int c)

    {

       if(a>b && a>c)
           return a;
       else if(b>a && b>c)
           return b;
       else
           return c;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 54;
        int b = 32;
        int c = 100;
        System.out.println("THe largest number among two integers is: "+ findMax(a,b));
        System.out.println("THe largest number among three integers is: "+ findMax(a,b,c));
    }
}

