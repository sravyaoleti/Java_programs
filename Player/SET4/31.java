package pl31;
import java.util.Scanner;
public class Pl31 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        
        int i=0;
        int c1=0,c2=0;
        while(i<ip.length())
        {
            if(ip.charAt(i)=='(')
            {
                c1++;
            }
               if(ip.charAt(i)==')')
            {
                c2++;
            }
            i++;
        }
        if((c2-c1)==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
