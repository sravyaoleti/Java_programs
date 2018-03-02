package javaapplication2;
import java.util.*;
//System.out.println();
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String ip=x.next();
        int len=ip.length();
        boolean num=false;
        boolean alph=false;
        for(int i=0;i<len;i++)
        {
            if(ip.charAt(i)>='1' && ip.charAt(i)<='9' )
            {
                num=true;
            }
            if(ip.charAt(i)>='a' && ip.charAt(i)<='z' )
            {
                alph=true;
            }
        }
        if(num && alph)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    } 
}
