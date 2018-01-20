
package median_element;

import java.util.Scanner;

public class Median_element {

    public static void main(String[] args) {
        
      Scanner a=new Scanner(System.in);
      System.out.println("Enter N and elements");
      int n=a.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=a.nextInt();
      }
      int temp=0;
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length;j++)
          {
              if(arr[i]<arr[j])
                      {
                          temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
                      }
          }
      }
      
      int x=arr.length;
      if(x%2==0)
      {
          int re=(x-1)/2;
          
         int fin=(arr[re]+arr[re+1])/2;
         System.out.println(fin);
        
      }
      else
      {
          System.out.println(arr[(x)/2]);
      }

    }
    
}
