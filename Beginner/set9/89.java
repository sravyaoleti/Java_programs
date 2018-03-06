package javaapplication47;
import java.util.*;
import java.lang.*;

public class JavaApplication47 {
    public static void main(String[] args) {
        String s;
        Scanner ss=new Scanner(System.in);
        s=ss.next();
        char v[]=s.toCharArray();
        Arrays.sort(v);
        for(int i=0;i<v.length;i++){
            System.out.print(v[i]);

       }
    }   
}
