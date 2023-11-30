package StringHw;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string with brackets");

        String str=sc.nextLine();
        str=str.trim();
        int x =str.length();

        if(str.charAt(0)=='(' && str.charAt(x - 1) == ')')
        System.out.println("Valid String");
        else if(str.charAt(0)=='{' && str.charAt(x - 1) == '}')
            System.out.println("valid String");
        else if(str.charAt(0)=='[' && str.charAt(x - 1) == ']')
            System.out.println("valid String");
        else
            System.out.println("Invalid String");
        }

}
