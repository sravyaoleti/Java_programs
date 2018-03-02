package javaapplication2;
import java.util.*;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int n1=x.nextInt();
        int res=n1*n;
        if(res%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    } 
}
