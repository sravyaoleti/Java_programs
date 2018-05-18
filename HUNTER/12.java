package p12;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int N=x.nextInt();
        int K=x.nextInt();
        int arr[]=new int[N];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=x.nextInt();
        }
        
        for(int i=0;i<N;i++)
        {
            for(int k=i;k<N;k++)
            {
                if(arr[i]<arr[k])
                {
                    int temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }
      System.out.print(arr[N-K]);
    }
}
