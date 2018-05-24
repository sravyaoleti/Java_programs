import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int mul=1,f=0;
        for(int i=1;i<=n;i++)
        {
            mul*=2;
            if(mul==n)
            {
                System.out.print("YES");
                f=1;
                break;
            }
          
        }
        if(f!=1)
        {
            System.out.print("NO");
        }

    }
}
