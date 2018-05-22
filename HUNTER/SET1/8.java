
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]==a[k])
                    {
                        if(a[i]<a[j] && a[j]<a[k])
                        {
                            System.out.println(a[i]+""+a[j]+""+a[k]);
                        }
                    }
                }
            }
        }
    }
}
