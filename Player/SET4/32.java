import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long a[]=new long[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                System.out.println("YES");
                f=2;
                break;
            }
        }
        if(f!=2)
        {
            System.out.println("NO");
        }
        
    }
}
