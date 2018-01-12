package javaapplication11;
import java.util.Scanner;
public class JavaApplication11 {
    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          System.out.println("Enter N");
          int lp=a.nextInt();
          int count=0;
          while(lp!=0)
          {
              lp/=10;
              count++;    
          }
          System.out.println(count);
    }   
}
