import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && i%2==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
