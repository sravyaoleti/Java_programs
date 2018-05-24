import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        int b=sc.nextInt();
        String x=Long.toString(a);
        char g=(char)(b+'0');
        
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i) == g)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
