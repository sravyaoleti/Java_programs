/package pkg44.java;
import java.util.*;
//System.out.println();
public class Java {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         int no=a.nextInt();
         int[] ar=new int[no];
         for(int i=0;i<no;i++)
         {
             ar[i]=a.nextInt();
         }
         int sum=0;
         for(int i=0;i<no;i++)
         {
            sum+=ar[i]; 
         }

            System.out.print(sum/no);             
    } 
}
