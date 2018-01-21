
package pkg42_cmp_print.large;

import java.util.Scanner;
import java.lang.*;


public class Large {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
        System.out.println("Enter a string");
        String in=a.nextLine();
        String temp=in;
        String[] x=in.split(" ");
        
        int ab=x[0].length();
        int ab1=x[1].length();
        
        if(ab>ab1)
        {
            System.out.print(x[0]);
        }
        if(ab<ab1)
        {
            System.out.print(x[1]);
        }
        if(ab==ab1)
        {
            System.out.print(temp);
        }
    }
}
