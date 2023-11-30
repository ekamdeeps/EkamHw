package Assignment1;

import java.util.Scanner;

public class HomeWork9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a day from the week");
        String day =sc.next();


        switch (day)
        {
            case "Sunday":
                System.out.println("Weekend");
                break;
            case "Monday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("invalid input");




        }


    }
}
