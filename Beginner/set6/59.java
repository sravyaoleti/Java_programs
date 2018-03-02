package javaapplication2;
import java.util.*;
//System.out.println();
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=x.nextInt();
        }
        int temp;
        for(int i=0;i<10;i++)
        {
            for(int j=i;j<10;j++)
            {
                if(a[i]<a[j])
                        {
                            temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
            }
        }
        System.out.print(a[0]); 
    } 
}
