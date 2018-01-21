
package count_no_of_words;
import java.util.Scanner;
import java.lang.*;
public class Count_no_of_words {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a string");
        String in=a.nextLine();
        String[] x=in.split(" ");
        int v=0;
        for(String c:x)
        {
            v++;
        }
        System.out.println(v-1);
    }
}
