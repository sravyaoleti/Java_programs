
package min_hrs_diff;

import java.util.Scanner;
import java.lang.*;

public class Min_hrs_diff {

 
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter hrs and min");
      int hrs=Integer.parseInt(a.next());
      int min=Integer.parseInt(a.next());
      int hrs1=Integer.parseInt(a.next());
      int min1=Integer.parseInt(a.next());
      int r1=hrs-hrs1;
      int r2=min-min1;
      System.out.println(Math.abs(r1)+" "+Math.abs(r2));
    }
    
}
