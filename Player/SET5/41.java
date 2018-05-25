import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n,k,mul=1,f=0;
        n=sc.nextInt();
        k=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            mul*=k;
            if(mul%k==0 && mul==n)
            {
                System.out.println("YES");
                f=1;
                break;
            }
        }
        if(f!=1)
        {
            System.out.println("NO"); 
        }
    }
}
