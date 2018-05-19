package pl1;
import java.util.Scanner;
public class Pl1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int t=n;
        int rev=0,dig=0;
        while(n!=0)
        {
            dig=n%10;
            rev=(rev*10)+dig;
            n/=10;
        }
        System.out.print(rev+" ");
    }
}
  
