
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
        if(a[i]==i)
        {
            System.out.print(a[i]+" ");
            f=1;
        }
    }
    
    if(f==0)
    {
        System.out.print("'-1'");
    }
}
}
