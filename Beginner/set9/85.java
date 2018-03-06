package javaapplication48;

import java.util.Scanner;
public class JavaApplication48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] temp=new char[str.length()];
        char[] temp1=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                temp[i]=str.charAt(i);
            }
            else
            {
              temp1[i]=str.charAt(i);  
            }
        }
        String even=new String(temp);
        String odd=new String(temp1);  
        System.out.println(even+" "+odd); 
        }    
    } 
