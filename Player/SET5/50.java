import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n,f=0;
        n=sc.nextInt();
        
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                System.out.println("YES");
                break;
            }
            else
            {
                f=0;
            }
        }
        if(f==0)
        {
            System.out.println("NO");
        }
    }
}
