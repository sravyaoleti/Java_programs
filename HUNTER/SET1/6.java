
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
        
        int f=0;
        for(int i=0;i<n;i++)
        {
            f=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    f=1;
                }
            }
            if(f==1)
            {
                System.out.println(arr[i]+" "+i);
                    break;
            }
        }
    }
}
