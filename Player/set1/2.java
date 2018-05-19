package pl1;
import java.util.Scanner;
public class Pl1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i=n,res=1;
        while(i>=1)
        {
            res*=i;
            i--;    
        }
        System.out.print(res+" ");
    }
}
  
