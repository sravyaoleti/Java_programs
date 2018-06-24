import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String no=Integer.toString(n);
        int f=0;
        for(int i=0;i<no.length();i++)
        {
            for(int j=i+1;j<no.length();j++)
            {
                if(no.charAt(i)==no.charAt(j))
                {
                    System.out.print("YES");
                    f=1;
                    break;
                }
            }
            if(f==1)
            {
                break;
            }
        }   
        if(f==0)
        {
            System.out.print("NO");
        }
    }
}
