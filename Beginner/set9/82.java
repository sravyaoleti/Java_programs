package javaapplication46;

import java.util.Scanner;
import java.text.DecimalFormat;
public class JavaApplication46 {
    public static void main(String[] args) {
          Scanner a=new Scanner(System.in);
          DecimalFormat df = new DecimalFormat(".00000");
      double l=a.nextDouble();
        double b=a.nextDouble();
        double ar=l*b;
        System.out.println(df.format(ar));
          
    }  
}
