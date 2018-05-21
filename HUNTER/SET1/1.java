package h1;
import java.util.Scanner;
public class H1 {
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       int no=x.nextInt();
       int[] arr=new int[no];
       for(int i=0;i<no;i++)
       {
           arr[i]=x.nextInt();
       }
       
       for(int i=0;i<no;i++)
       {
           for(int j=i+1;j<no;j++)
           {
               if(arr[i]==arr[j])
               {
                   System.out.print(arr[i]+" ");
                   break;
               }
           }
       }
    }
    
}
