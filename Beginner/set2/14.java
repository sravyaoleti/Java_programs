package odd_intreval;
import java.util.Scanner;
public class Odd_intreval {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          System.out.println("Enter N and Q");
          int n=a.nextInt();
          int q=a.nextInt();
          if(n<100000)
          {
              for(int i=n+1;i<q;i++)
          {
              if(i%2!=0)
              {
               System.out.println(i);
              }
          }
              
          }
    } 
}
