package Assignment1;

public class Homework11
{

    public static boolean palindrome(String str){
        String str1="";
        int a=str.length();
        for (int i = a-1; i >=0 ; i--) {
           str1=str1+str.charAt(i);

        }
        if(str1.equalsIgnoreCase(str))
        return true;
        else
            return false;


    }


    public static void main(String[] args) {

        String str= "Mom";

        boolean b= palindrome(str);
        if (b)
            System.out.println("The given String is Palindrome");
        else
            System.out.println("The given String is not Palindrome");

    }
}