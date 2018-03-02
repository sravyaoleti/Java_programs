package javaapplication2;
import java.util.*;
//System.out.println();
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a+" "+b);
    } 
}
