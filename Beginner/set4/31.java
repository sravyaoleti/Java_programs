
package sen_let_count;

import java.util.Scanner;

public class Sen_let_count {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a string");
        String in=a.nextLine();
        int x=in.length();
        int cou=0;
        for(int i=0;i<x;i++)
        {
            char y=in.charAt(i);
            if(y==' ')
            {
               System.out.println(" White space");
            }
            else
            {
                cou++;
            }  
        }
        System.out.println(cou);
    }
}
