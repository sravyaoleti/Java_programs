
package first_5_multiples;

import java.util.Scanner;

public class First_5_multiples {
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter N");
      int n=a.nextInt();
      for(int i=1;i<=5;i++)
      {
          int ab=i*n;
          System.out.println(ab);
      }
    }
}
