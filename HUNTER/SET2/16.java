import java.util.Scanner;
import java.lang.Math;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int d[]=new int[n];
        
          // GETTING INPUT FROM USER AND STORING DIFF IN D ARRAY
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            d[i]=Math.abs(a[i]-k);
            
        }
          // SORTING D ARRAY
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(d[i]<d[j])
                {
                    int t=d[i];
                    d[i]=d[j];
                    d[j]=t;
                }
            }
        }
        
        //OUTPUT first 3 a array with respect to d array  
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(d[i]==(Math.abs(a[j]-k)) && d[i]>0)
                {
                    c++;
                    System.out.print(a[j]+" ");
                    a[j]=100002;
                     if(c>=3){
                         c=8;
                        break;
                        }
                }
            }
            if(c==8)
                {
                    break;
                }
        }
    }
}
