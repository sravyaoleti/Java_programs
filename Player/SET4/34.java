import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        
        for(int i=0;i<ip.length();)
        {
            System.out.print(ip.charAt(i));
            i=i+3;
        }
    }
}
