package power;
import java.util.Scanner;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
          System.out.println("Enter N and exp");
          double lp=a.nextInt();
          double exp=a.nextInt();
         // double x=Math.pow(lp, exp);
         double x=1;
         for(int i=1;i<=exp;i++)
         {
             x=x*lp;
         }
          System.out.println(x);
        // TODO code application logic here
    }
    
}
