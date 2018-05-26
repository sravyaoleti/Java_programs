package string.rotate;
import java.util.Scanner;
public class StringRotate {
    public static char[] rotate(char[] str,int l)
    {
        char x=str[l];
        
        for(int i=l;i>0;i--)
        {
            str[i]=str[i-1];
        }
        str[0]=x;
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	int n,l=0;
	String a,op;
        a=sc.next();  
        n=sc.nextInt();

	char[] str=a.toCharArray();
	l=(str.length-1);
        char[] rot=new char[l+1];
            
        for(int i=1;i<=n;i++)
          rot=rotate(str,l);
  
        op=new String(rot);
	System.out.println(op);
    }
}
