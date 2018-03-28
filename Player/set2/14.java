package p12;
import java.util.*;
public class P12 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String ip=sc.nextLine();
    char[] ipch=ip.toCharArray();
    for(int x=0;x<ipch.length;x++)
    {
        if(ipch[x]=='A' || ipch[x]=='E' ||ipch[x]=='I' ||ipch[x]=='O' || ipch[x]=='U')
        {
            ipch[x]=Character.toLowerCase(ipch[x]);
        }
    }  
    char[] vow={'a','e','i','o','u'};
    int f=0; 
    char[] temp=new char[ipch.length];
    for(int i=0;i<ipch.length;i++)
    {
        f=0;
        for(int j=0;j<vow.length;j++)
            if(ipch[i]==vow[j])
                f=1;
        if(f==0)
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
