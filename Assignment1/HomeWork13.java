package Assignment1;

import java.util.Scanner;

public class HomeWork13 {


    public static int sum(int a, int b)

    {

        return(a+b);

    }
    public static int sum(int a, int b, int c)

    {

        return(a+b+c);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= 45;
        int b= 52;
        int c= 65;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}

