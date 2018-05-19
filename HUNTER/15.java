package p15;
import java.util.Scanner;
public class P15 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int N=x.nextInt();
        int[] arr=new int[N];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=x.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
