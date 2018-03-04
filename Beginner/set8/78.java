package javaapplication43;
import java.util.Scanner;
//System.out.println();
public class JavaApplication43 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int ab=a.nextInt();
        if(ab%13==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
