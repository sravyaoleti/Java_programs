
package pkg39;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner a=new Scanner(System.in);

    
int n=10;
      int arr[]=new int[n];

      int temp;

      for(int i=0;i<n;i++)

      {

          arr[i]=a.nextInt();

      }

      for(int i=0;i<n;i++)

      {

          for(int j=i;j<n;j++)

          {

              if(arr[j]<arr[i])

              {

                  temp=arr[i];

                  arr[i]=arr[j];

                  arr[j]=temp;

              }

          }

      }


          System.out.print(arr[9]);

    }
    
}
