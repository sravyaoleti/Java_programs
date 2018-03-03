package pkg44.java;
import java.util.*;
//System.out.println();
public class Java {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         int no=a.nextInt();
         int count=0;
         while(no!=0)
         {
             int dig=no%10;
             count++;
             no/=10;
         }
         System.out.println(count);
    } 
}
