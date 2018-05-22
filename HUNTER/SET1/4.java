
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int[] a=new int[n];
    
    for(int i=0;i<n;i++)
        a[i]=x.nextInt();
        
    int f=0;
    for(int i=0;i<n;i++)
    {
        f=0;
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                f++;
            }
        }
        if(f==0)
        {
            System.out.print(a[i]);
            break;
        }
    }
}}
