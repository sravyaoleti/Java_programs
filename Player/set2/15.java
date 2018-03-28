package p15;
import java.util.*;
public class P15 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String ip=sc.nextLine();
    int count=1,max=1;
    char op=' ';
    for(int i=0;i<ip.length();i++)
    {
        for(int j=i+1;j<ip.length();j++)
        {
            if(ip.charAt(i)==ip.charAt(j))
            {
                count++;
            }
        }
        if(count>max)
        {
            op=ip.charAt(i);
            max=count;
        }
    }
    System.out.println(op);
    }
}
