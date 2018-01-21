
package min_hrs;
import java.util.*;
import java.lang.*;
public class Min_hrs {
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter min");
      int min=a.nextInt();
      int count=0;
      int temp=min;
      if(min>60)
      {
          while(min%60!=0)
      {
          count++;
          min--; 
      }
      int hrs=temp/60;
      int minn=temp%60;
      
      System.out.println(hrs+" "+count);
      }
      else if(min<60 || min==60)
      {
          if(min==60)
          {
              System.out.println(1+" "+0);
          }
          else
          {
              System.out.println(0+" "+min);
          }
      }
      }
      
    
}
