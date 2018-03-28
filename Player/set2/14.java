package p12;
import java.util.*;
public class P12 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String ip=sc.nextLine();
    char[] ipch=ip.toCharArray();
    char[] vow={'a','e','i','o','u'};
    char[] vowup={'A','E','I','O','U'};
    int f=0,f1=0;
    char[] temp=new char[ipch.length];
    for(int i=0;i<ipch.length;i++)
    {
        f1=0;f=0;
        for(int j=0;j<vow.length;j++)
            if(ipch[i]==vow[j])
                f=1;
        for(int k=0;k<vowup.length;k++)
            if(ipch[i]==vow[k])
                f1=1;
        if(f==0 && f1==0)
            temp[i]=ipch[i];     
    }
   int start=0,end=temp.length-1;
   while(start<end)
   {
       char t=temp[start];
       temp[start]=temp[end];
       temp[end]=t;
       start++;
       end--;
   }
   System.out.println(temp);   
    }
}
