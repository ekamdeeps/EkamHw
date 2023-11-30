package StringHw;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String input");
        String str=sc.next();
        str=str.toLowerCase();
        int s = str.length();
        char[] a=str.toCharArray();

        char[] b = new char[s];
        int j=0;
        for (int i = str.length()-1; i >=0; i--) {

            b[i]= a[j];
            j++;

        }
        int c=0;
        for (int i = 0; i <s ; i++) {

            if(a[i]==b[i])
                c++;


        }
        if(c==s)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");


        }
    }
