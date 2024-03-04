class Fibonaci
{
  void fibo(int n)
  {
    int i=1,fib=0;
    while(i<n)
    {
       fib=fib+i;
       System.out.println(fib+" ");
       i = i+2;
       fib = 0;
     }
   }
   public static void main(String args[])
   {
       new Fibonaci().fibo(19);
   }
}