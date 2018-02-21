package pkg34;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a string");
        String in=a.nextLine();
        
        int count=0;
        int len=in.length();
        
        for(int i=0;i<len;i++)
        {
            if(in.charAt(i)=='.')
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
}
