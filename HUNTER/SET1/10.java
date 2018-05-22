
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] a1=new int[a];
        int[] b1=new int[b];
        
        for(int i=0;i<a;i++)
        {
            a1[i]=sc.nextInt();
        }
        
        for(int i=0;i<b;i++)
        {
            b1[i]=sc.nextInt();
        }
        
        int f=0;
        for(int i=0;i<b;i++)
        {
            f=0;
            for(int j=0;j<a;j++)
            {
                if(b1[i]==a1[j])
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.println("NO");
                break;
            }
            else
            {
                f=2;
            }
        }
        if(f==2)
        {
            System.out.println("YES");
        }
    }
}
