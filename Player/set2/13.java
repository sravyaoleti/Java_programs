package p15;
import java.util.Scanner;
public class P15 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int res=0,dig=0;
        while(n!=0)
        {
            dig=n%10;
            res+=dig*dig;
            n/=10;
        }
        System.out.println(res);
    }
}
