package pkg71;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String str=a.nextLine();
        String rev="";
        int len=(str.length()-1);
        for(int i=len;i>=0;i--)
        {
           rev+=str.charAt(i);
        } 
        if(str.equals(rev))
        {
            System.out.println("Yes"); 
        }
        else
        {
            System.out.println("No"); 
        }        
    }  
}
