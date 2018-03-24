package p5_roman_no;
import java.util.*;

public class P5_roman_no {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String[] roman={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String ip=x.nextLine();
        int flag=0;
        String newip="";
        if(ip.startsWith("X") && ip.length()>1)
        {
           newip=ip.substring(1);
           flag=1;
        }
        if(flag==1 && ip.endsWith("X"))
            {
                System.out.print(20);
                flag=2;
            }
        if(flag==1 || flag==0)
        {
            for(int i=0;i<roman.length;i++)
        {
            if(flag==0)
            {
                if(ip.equals(roman[i]))   
                    System.out.print(i+1);
            }
            else if(flag==1)
            {
                if(newip.equals(roman[i]))                              
                System.out.print("1"+(i+1));
            }
        }       
        }   
    }    
}
