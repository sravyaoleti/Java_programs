package p7;
import java.util.Scanner;
public class P7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        char[] ipch=ip.toCharArray();
        for(int i=0;i<ip.length();i++)
        {
            if(i%2!=0)
            {
            char temp=ipch[i];
            ipch[i]=ipch[i-1];
            ipch[i-1]=temp;
            }
        }
     System.out.print(ipch);
    } 
}
