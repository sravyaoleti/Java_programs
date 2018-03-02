package javaapplication2;
import java.util.*;
//System.out.println();
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int res=0;
        int f=1,s=1,t=0;
        while(t<=a)
        {
           
            f=s;
            s=t;
            t=f+s;
            if(t>=a)
            {
                break;
            }
            else
            {
                 System.out.print(t+" "); 
            }
        }           
    }
