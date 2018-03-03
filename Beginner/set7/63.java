package pkg44.java;
import java.util.*;
//System.out.println();
public class Java {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         String n=a.nextLine();
         int len=n.length();
         int cou=1;
         for(int i=0;i<len;i++)
         {
             if(n.charAt(i)==' ' && n.charAt(i+1)!=' ')
                     {
                         cou++;
                     }
         }
         System.out.println(cou);
    }  
}
