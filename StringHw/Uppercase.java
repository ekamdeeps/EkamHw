package StringHw;

import java.util.Scanner;

public class Uppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String input");
        String str = sc.next();
        str=str.toUpperCase();

        System.out.println(str);


    }
}
