package sum_1stk_array;
import java.util.Scanner;
public class Sum_1stk_array {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] ar=new int[20];
        System.out.println("Enter N");
        int n=a.nextInt();
        System.out.println("Enter K");
        int k=a.nextInt();
        for(int i=0;i<n;i++)
        {
            ar[i]=a.nextInt();
        }
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("The sum of first "+k+" element is "+sum);
    }   
}
