package alphabetornot;
import java.util.Scanner;
public class Alphabetornot {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a key");
        char ip=scan.next().charAt(0);
        if((ip>'a' && ip<'z') || (ip>'A' && ip<'Z'))  
        {
            System.out.println("Entered key is a Alphabet");
        }
        else
            System.out.println("Entered key is a Charcter");
    } 
}
