import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int rev=0;
        int rev1=0;
        int temp=n;
        while(n!=0)
        {
            int dig=n%10;
            rev=(rev*10)+dig;
            n=n/10;
        }
        while(rev!=0)
        {
            int dig1=rev%10;
            System.out.print(dig1+" ");
            rev=rev/10;
        }
    }
}
