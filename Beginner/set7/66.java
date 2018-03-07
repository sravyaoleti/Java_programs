package javaapplication50;
import java.util.Scanner;
public class JavaApplication50 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int f=0;
      for(int i=2;i<n/2;i++)
      {
          if(n%i==0)
          {
               f=1;
               break;
          }
      }
      if(f==1)
      {
          System.out.println("No");
      }
      else
      {
          System.out.println("yes");
      }
    }
}
