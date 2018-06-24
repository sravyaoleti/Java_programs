import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res="";
        while(n!=0)
        {
            res+=Integer.toString(n%2);
            n=n/2;
        }
        StringBuilder a=new StringBuilder(res);
        a.reverse();
        res=a.toString();
        Long x=Long.parseLong(res);
        System.out.println(x);
    }
}
