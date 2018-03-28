package p16;
import java.util.*;
public class P16 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double[] a=new double[n];
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    int flag=0;
    for(int i=0;i<n;i++)
    {
        flag=0;
        for(int j=0;j<n;j++)
        {
            if(i!=j && a[i]==a[j])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
          System.out.println(a[i]);  
          break;
        }
    }
    }}
