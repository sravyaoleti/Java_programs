package pkg44.java;
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
         for(int i=0;i<no;i++)
         {
             for(int j=i;j<no;j++)
             {
                 if(ar[i]<ar[j])
                 {
                     int temp=ar[i];
                     ar[i]=ar[j];
                     ar[j]=temp;
                 }
             }
         }

            System.out.print(ar[no-1]+" "+ar[0]);             
    } 
}
