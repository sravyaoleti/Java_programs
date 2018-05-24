import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        char[] a=ip.toCharArray();
        int[] count=new int[a.length];
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                   count[i]+=1;
                   a[j]='#';
                }
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!='#')
            {
                 System.out.print(a[i]);
            }
        }
    }
}
