package Operation;
public class Fibonacci
{
   public void fibo(int p)
   {

     int a,b,c;
     a=0;
     b=1;
     System.out.println(a+"");
     System.out.println(b);
     for(int i=2;i<p;i++)
     {
       c=a+b;
       System.out.println(c);
       a=b;
       b=c;
     }
   }
}

     