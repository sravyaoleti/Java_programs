
package javaapplication24;
import java.util.Scanner;
public class JavaApplication24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        String[] a=ip.split(" ");
        int cou=0;
        for(String x:a){cou++;}
        
        int count=0,max=0;
        char t='x';
        for(int i=0;i<cou;i++)
        {
            for(int j=0;j<a[i].length();j++)
            {
                max=0;count=0;
                for(int k=j+1;k<a[i].length();k++)
                {
                    if(a[i].charAt(k)==a[i].charAt(j))
                    {
                        count++;
                    }
                }
                if(count>max)
                {
                    max=count;
                    t=a[i].charAt(j);
                }
            }
            System.out.print(t+" ");
        }
    }
}
