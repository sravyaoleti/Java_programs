package p11;
import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x=new Scanner(System.in);
        String ip=x.nextLine();
        String[] buf=ip.split(" ");
        String rev="";
        for(int i=0;i<buf.length;i++)
        {
         char[] one=buf[i].toCharArray();
            
        int start=0,end=one.length-1;
        while(start<end)
        {
            char t=one[start];
            one[start]=one[end];
            one[end]=t;
            start++;end--;
        }
        rev=rev+String.valueOf(one)+" ";
        }
         System.out.println(rev);
    }
}
