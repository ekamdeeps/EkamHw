package StringHw;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String input");
        String str = sc.next();
        int vow=0, cons=0;
        str=str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                vow++;
            else
                cons++;


        }
        System.out.println("The number of Vowels in the String are: "+ vow);
        System.out.println("The number of Consonants in the String are: "+ cons);
    }
}
