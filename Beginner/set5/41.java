
package pkg41_string_print;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a string");
        String in=a.nextLine();
        String[] x=in.split(" ");
        int n=Integer.parseInt(x[1]);
        for(int i=0;i<n;i++)
        {
            System.out.println(x[0]);
        }
        // TODO code application logic here
    }
    
}
