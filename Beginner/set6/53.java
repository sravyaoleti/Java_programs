package javaapplication2;
import java.util.*;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int sum=0;
        while(n!=0)
        {
            int dig=n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println(sum);
    } 
}
