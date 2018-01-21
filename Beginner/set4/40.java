
package pkg40_fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("");
        int n=a.nextInt();
        int n1=0;
        int n2=1,n3=0;
        System.out.print(n1+" "+n2);
        while(n3<n)
        {
            n3=n1+n2;
            if(n3<n)
            {
            System.out.print(" "+n3);
            }
            if(n3==n)
            {
                System.out.print(" "+n3);
            }
            n1=n2;
            n2=n3;  
        }
    }
}
