package factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter N");
      int n=a.nextInt();
      int mul=1;
      while(n!=0)
      {
         mul=mul*n;
         --n;
      }
      System.out.println(mul);
    }
}
