package javaapplication43;
import java.util.Scanner;
//System.out.println();
public class JavaApplication43 {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int ab=a.nextInt();
        int dig,rev=0;
        while(ab!=0)
        {
            dig=ab%10;
            rev=(rev*10)+dig;
            ab/=10;
        }
   while(rev!=0)
        {
            dig=rev%10;
            if(rev%2!=0)
            {
               System.out.print(dig+" "); 
            }
            rev/=10;
        } 
    }
}
