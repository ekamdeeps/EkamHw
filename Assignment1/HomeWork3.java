package Assignment1;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         char ch='a';
        do {

        System.out.println("Please enter an alphabet to print and press q to exit");
        ch = sc.next().charAt(0);
        System.out.println("The alphabet is: "+ ch);

    }while(ch!='q');
        System.out.println("You have exited the loop");
    }
}
