package armstrong_ornot;
import java.util.Scanner;

public class Armstrong_ornot {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
          System.out.println("Enter N");
          int n=a.nextInt();
          int dig=0,sum=0,temp,temp1;
          temp=n;
          temp1=n;
           while(temp1!=0)
            {
                dig=temp1%10;
                sum=(dig*dig*dig)+sum;
                temp1/=10;
            }
            if(sum==temp)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
    }
}
