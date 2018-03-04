package javaapplication46;
import java.util.Scanner;
import java.text.DecimalFormat;
public class JavaApplication46 {
    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          int x=a.nextInt();
          int count=0;
          while(x!=0)
          {
              int dig=x%10;
              count++;
              x/=10;
          }
          System.out.println(count);
          
    }  
}
