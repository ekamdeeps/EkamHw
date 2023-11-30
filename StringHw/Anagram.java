package StringHw;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String input");
        String str = sc.next();
        System.out.println("Enter the 2nd String input");
        String str1 = sc.next();
        str = str.toLowerCase();
        int s = str.length();
        char[] a = str.toCharArray();
        str1 = str1.toLowerCase();
        int s1 = str1.length();
        char[] b = str1.toCharArray();
        char temp = ' ';

        if(s==s1) {
            for (int i = 0; i < s; i++) {

                for (int j = i + 1; j < s; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }


            }
            temp = ' ';
            for (int i = 0; i < s1; i++) {

                for (int j = i + 1; j < s1; j++) {
                    if (b[i] > b[j]) {
                        temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }

            int c = 0;
            for (int i = 0; i < s; i++) {

                if (a[i] == b[i])
                    c++;


            }
            if (c == s)
                System.out.println("It is Anagram");
            else
                System.out.println("It is not Anagram");

        }
        else
            System.out.println("It is not Anagram");


        }
    }

