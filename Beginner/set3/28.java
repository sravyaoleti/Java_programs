package string_java;
import java.util.*;
import java.lang.*;

public class String_java {
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter N and elements");
      int n=a.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=a.nextInt();
      }
      for(int i=0;i<n;i++)
      {
          System.out.println(arr[i]+" "+i);
      }
        
    }
    
}
