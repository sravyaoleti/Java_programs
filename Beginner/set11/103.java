package javaapplication47;
import java.util.Scanner;
import java.lang.*;

public class JavaApplication47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
                int array_size=0,i=0;
		char first_char;
		String temp="";
		String[] array=input.split(" ");
		for(String ss:array)
		{
			array_size++;		
		}
		for(int j=0;j<array_size;j++)
		{
			
                    char fUpper = Character.toUpperCase(array[i].charAt(0));
		                char dummy=array[i].charAt(0);
                    
                    String st = Character.toString(fUpper);
                    
                    String st1 = Character.toString(dummy);
			
		    array[i]=array[i].replaceFirst(st1,st);
			
		    temp=temp + array[i]+" ";
			
		    i++;	
		}
                
		System.out.print(temp);
    }   
}
