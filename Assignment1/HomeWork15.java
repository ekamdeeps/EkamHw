package Assignment1;

import java.util.Scanner;

public class HomeWork15 {


    public static String printInfo(int i)

    {

        return("The integer is: "+ i);

    }

    public static String printInfo(double d, String str)

    {

        return(str+ " "+ d);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d =5.0;
        int i=6;
        String str= "Ekam is";

        System.out.println(printInfo(i));
        System.out.println(printInfo(d,str));
    }
}

