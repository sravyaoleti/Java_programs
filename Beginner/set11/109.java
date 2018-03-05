package javaapplication46;
import java.util.Scanner;
public class JavaApplication46 {
    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int[] a=new int[10];
          for(int i=0;i<10;i++)
          {
              a[i]=s.nextInt();
          }
          for(int i=0;i<10;i++)
          {
              for(int j=i;j<10;j++)
              {
                  if(a[i]>a[j])
                  {
                      int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;
                  }
              }
          }
              System.out.print(a[0]);
    }  
}
