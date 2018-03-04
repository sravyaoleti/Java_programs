package javaapplication46;
import java.util.Scanner;
public class JavaApplication46 {
    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          int n=a.nextInt();
          int k=a.nextInt();
           int count=0;
          int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=a.nextInt();
          }
          for(int i=0;i<n;i++)
          {
          if(arr[i]==k)
              {
                  count++;
              }
          }
             System.out.println(count); 
    }  
}
