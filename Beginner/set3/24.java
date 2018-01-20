
package sorting_an_array;
import java.util.*;
public class Sorting_an_array {
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter N and elements");
      int n=a.nextInt();
      int arr[]=new int[n];
      int temp;
      for(int i=0;i<n;i++)
      {
          arr[i]=a.nextInt();
      }
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if(arr[j]<arr[i])
              {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
      for(int i=0;i<n;i++)
      {
          System.out.print(arr[i]+" ");
      }
  
    }
    
}
