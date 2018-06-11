package bitwise_and;
import java.util.*;
public class Bitwise_and {
    
    static int factor(int f,int ack)
    {
        int fact=1;
        for(int i=f;i>=ack && f!=1;i--)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,n,r;
        a=sc.nextInt();
        b=sc.nextInt();
        n=a;
        r=a-b;
        System.out.println(factor(n,1)/(factor(b,1)*factor(r,1)));       
    } 
}
