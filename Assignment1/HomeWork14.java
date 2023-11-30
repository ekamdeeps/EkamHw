package Assignment1;

import java.util.Scanner;

public class HomeWork14 {


    public static double calculateArea(double l, double w)

    {

        return(l*w);

    }
    public static double calculateArea(double s) {

        return (s * s);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=5.0;
        double w=6.0;
        double s=4.0;

        System.out.println("Area of Square is: "+ calculateArea(s));
        System.out.println("Area of Rectangle is: "+calculateArea(l,w));
    }
}

