package pkg79;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        int y=a.nextInt();
        int p=x*y;
        boolean b=false;
        for(int i=1;i<=p;i++)
        {
            if(i*i==p)
            {
                System.out.println("Yes");
                b=true;
                break;
            }
        }
        if(b==false)
        {
           System.out.println("No"); 
        }
    }  
}
