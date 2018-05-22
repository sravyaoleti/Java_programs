
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int[] a=new int[n];
    
    for(int i=0;i<n;i++)
        a[i]=x.nextInt();
        
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            if(a[i]<a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    
    String res=""; 
    for(int i=0;i<n;i++)
    {
        res+=a[i];
    }
    int num=Integer.parseInt(res);
    System.out.println(num);
    }
}
