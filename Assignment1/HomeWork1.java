package Assignment1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=0,b=1,sum=0;
        System.out.println("Enter n value for Fibonocci series");
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++)
          {
            sum=a+b;
              System.out.println(sum);
            a=b;
            b=sum;

        }

    }
}
