package primeno_or_not;
import java.util.Scanner;
public class Primeno_or_not {
    public static void main(String[] args) {
        
          Scanner a=new Scanner(System.in);
          System.out.println("Enter N");
          int n=a.nextInt();
          int f=0;
          for(int i=2;i<=n/2;i++)
          {
              if(n%i==0)
              {
                  f=1;
                  break;
              }
          }
          if(f==1)
          {
              System.out.println("NO");
          }
          else
          {
              System.out.println("YES");
          }
    }
    
}
