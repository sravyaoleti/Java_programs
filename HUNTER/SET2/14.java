import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        
        char[] a=ip.toCharArray();
        char[] a1=ip.toCharArray();
        int f=1;
        
        for(int i=a.length;i>=1;i--)
        {
            f*=i;
        }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    char t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        
        
           int count=0,max=1;
        for(int i=0;i<a.length;)
        {
            count=0;
            for(int j=i;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                   count++; 
                }
            }
            if(count>1)
            {
                max*=count;
                i=count+i;
            }
            else
            {
                i++;
            }
        }
        
     
        int per=(f/max);
        int p=0;
            
            for(int k=0;k<a1.length;k++)
                {
                    System.out.print(a1[k]+" ");
                }
           System.out.println();
           
     if(per>1)
     {
          for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1.length-1;j++)
            {
                p++;
                char t=a1[j];
                a1[j]=a1[j+1];
                a1[j+1]=t;
                for(int k=0;k<a1.length;k++)
                {
                    System.out.print(a1[k]+" ");
                }
                System.out.println();
                if(p>=(per-1))
                {
                    p=8888;
                    break;
                }
            }
            if(p==8888)
            {
                break;
            }
        }
         
     }
    }
}
