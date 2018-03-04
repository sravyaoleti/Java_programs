
package javaapplication43;
import java.util.Scanner;
//System.out.println();
public class JavaApplication43 {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int x=a.nextInt();
        int y=a.nextInt();
        if(n>x && n<y)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        // TODO code application logic here
    }
}
