package javaapplication47;
import java.util.*;
import java.lang.*;

public class JavaApplication47 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int lcm;
        int n1=s.nextInt();
        int n2=s.nextInt();
        lcm=(n1>n2)?n1:n2;
        while(true)
        {
            if(lcm%n1==0 && lcm%n2==0)
            {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
    }   
}
