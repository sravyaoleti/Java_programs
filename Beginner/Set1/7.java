package hello3times;

import java.util.Scanner;

public class Hello3times {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String ab="Hello";
        System.out.println("Enter no of times to repeat");
        int lp=a.nextInt();
        for(int i=0;i<lp;i++)
        {
            System.out.println(ab);
        }
  
    }
    
}
