package pl1;
import java.util.Scanner;
public class Pl1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String y=x.nextLine();
        char[] ip=y.toCharArray();
        int start=0,end=ip.length-1;
        while(start<end)
        {
            //System.out.print("a");
            char t=ip[start];
            ip[start]=ip[end];
            ip[end]=t;
            start++;end--;
        }
        System.out.println(ip);
    }
}
  
