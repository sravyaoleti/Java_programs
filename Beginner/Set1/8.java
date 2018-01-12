package naturalnos;
import java.util.Scanner;
public class Naturalnos {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter N");
        int lp=a.nextInt();
        int sum=0;
        for(int i=0;i<=lp;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of natural nos is   "+sum);
    }
}
