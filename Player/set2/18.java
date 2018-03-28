package anagram;
import java.util.*;

public class Anagram {
    
    static boolean sort(char a[])
    {
        for(int i=0;i<a.length;i++)
         {
             for(int j=i;j<a.length;j++)
             {
                 if(a[i]>a[j])
                 {
                     char t=a[i];
                     a[i]=a[j];
                     a[j]=t;
                 }
             }
         }
        String b=String.valueOf(a);
        if(b.equals("aabikl"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         String[] ip=new String[n];
         for(int i=0;i<n;i++)
             ip[i]=s.next();
         int count=0;
         for(int i=0;i<n;i++)
         {
             char[] x=ip[i].toCharArray();
             boolean f=sort(x);
             if(f==true)
             {
                 count++;
             }
         }
         System.out.println(count);
    }
}
