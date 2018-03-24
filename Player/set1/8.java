import java.util.Scanner;
public class P8_camelcase {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String s2=s.nextLine();
     String s1=s2.toLowerCase();
     String temp="";
     for(int i=0;i<sp.length;i++)
     {
         String x=sp[i].substring(0,1);
         String up=x.toUpperCase();
         sp[i]=sp[i].replaceFirst(x, up);
         temp=temp+sp[i]+" "; 
     }
     System.out.print(temp);
    }
}
