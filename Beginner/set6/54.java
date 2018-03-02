package javaapplication2;
import java.util.*;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        if(n%2==0)
        {
             System.out.println(n);
        }
        else
        {
            System.out.println(n-1);
        }
    } 
}
