package Assignment1;

import java.util.Scanner;

public class HomeWork10 {


    public static double area(double radius){

        return((22.0/7.0)*radius*radius);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter radius of circle in cm");
        double radius=sc.nextDouble();
        System.out.println(area(radius));



        }


    }
