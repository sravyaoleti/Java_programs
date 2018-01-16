package palindrome;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          System.out.println("Enter N");
          int n=a.nextInt();
          int dig=0,rev=0,temp;
          temp=n;
          while(n!=0)
          {
              dig=n%10;
              rev=(rev*10)+dig;
              n/=10;
          }
          if(rev==temp)
          {
              System.out.println("YES");
          }
          else
          {
              System.out.println("NO");
          }
        

        // TODO code application logic here
    }
    
}
