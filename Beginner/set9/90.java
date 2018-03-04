package javaapplication46;

import java.util.Scanner;
public class JavaApplication46 {
    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          String str=a.nextLine();
          for(int i=0;i<str.length();i++)
          {
              if((str.charAt(i)>='0') && (str.charAt(i)<='9'))
              {
                 System.out.print(str.charAt(i)); 
              }
          }
    }  
}
