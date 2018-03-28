package prime_in_range;
import java.util.*;
public class Prime_in_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int f=0,count=0;
        while(min<=max)
        {
            f=0;
            for(int i=2;i<=min/2;i++)
            {
                if(min%i==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                count++;
            }
            min++;
        }
        System.out.println(count);
    }
}
