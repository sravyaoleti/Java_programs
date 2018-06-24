import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int k=sc.nextInt();
        String no=Integer.toString(n);
        System.out.print(no.charAt(p+k-1));
    }
}
