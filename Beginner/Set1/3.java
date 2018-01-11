import java.util.Scanner;
public class VOWELOrCONSONANT {
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter a Char");
        char ip=ch.next().charAt(0);
        if(ip=='a' || ip=='e' || ip=='i' || ip=='o' || ip=='u')
        {
            System.out.println("Entered Chracter is a Vowel  :"+ip);
        }
        else if((ip>'a' && ip<'z') || (ip>'A' && ip<'Z'))
            System.out.println("Entered Chracter is a Consonant  "+ip);
        else
            System.out.println("Entered Chracter is a char  "+ip);          
    }  
}
