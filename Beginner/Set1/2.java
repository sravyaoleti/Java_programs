import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no");
        int no= scan.nextInt();
        int x=(no%2);
        if(x==0)
        {
            System.out.println("The no is EVEN");
        }
        else
        {
            System.out.println("The no is ODD");
        }
    }
    
}
