package pl46;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pl46 {
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    double pi=3.14,rad=0;
    int angle;
    angle=sc.nextInt();
    
    rad=(angle*(pi/180));
    System.out.println(df2.format(Math.sin(rad)));
    }   
}
