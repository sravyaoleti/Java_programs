package javaapplication48;

import java.util.Scanner;
public class JavaApplication48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<='z' && str.charAt(i)>='a' || str.charAt(i)<='Z' && str.charAt(i)>='A' ||  str.charAt(i)<='/' && str.charAt(i)>=' ' )
            {
                System.out.printf("No");
                flag=1;
                break;               
            }
        }
        if(flag==0)
        {
            System.out.printf("Yes");
        }
    }  
}
