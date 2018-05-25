
package pl43;
import java.util.Scanner;
public class Pl43 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String a,b;
         int lb,f=0;
          a=sc.nextLine();
          b=sc.nextLine();
          lb=b.length();
        
         for(int i=0;i<a.length();i++)
         {
             int y=i,y1=i+lb;
             if(y1<a.length())
             {
                 String t=a.substring(y, y1);
                 if(t.equals(b))
                 {
                     System.out.println("YES");
                     f=1;
                     break;
                 }
             }
             else
             {
                 String t1=a.substring(y, a.length());
                 if(t1.equals(b))
                 {
                     System.out.println("YES");
                     f=1;
                     break;
                 }
             }
         }
         if(f!=1)
         {
             System.out.println("NO");
         }
    }
}
