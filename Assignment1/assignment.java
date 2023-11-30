package Assignment1;

import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
                System.out.println("Enter user age");
        int age=sc.nextInt();
       if(age>=18)
           System.out.println("Eligible to vote");
       else if(age<=18 && age>0)
           System.out.println("Ineligible to vote");
       else
           System.out.println("Invalid age entered");



    }
}
