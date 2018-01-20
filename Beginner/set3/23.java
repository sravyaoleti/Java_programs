package max;
import java.util.*;
public class Max {
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("Enter N and elements");
      int n=a.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=a.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(arr[0]);
    }
}
