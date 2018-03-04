
package javaapplication43;
import java.util.Scanner;
//System.out.println();
public class JavaApplication43 {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String ip=a.nextLine();
        int len=ip.length();
        int mid=len/2;
        char[] x=ip.toCharArray();
        if(len%2==1)
        {
            x[mid]='*';
            
        }
        else
        {
            x[mid]='*';
            x[mid-1]='*';
        }
        System.out.println(x);
    }
}
