
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            int x=(i%2==0)?1:0;
            int y=(arr[i]%2==0)?1:0;
            
            if(x==1 && y==0)
            {
                System.out.print(arr[i]+" ");
            }
            if(x==0 && y==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
