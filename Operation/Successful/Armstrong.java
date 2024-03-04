package Operation.Successful;

public class Armstrong
{
   public void check(int n)
   {
     int r,sum=0;
     intp=n;
     while(n!=0)
     {
      r=n%10;
      sum=sum+(r*r*r);
      n=n/10;
}
if(sum==p)
{
System.out.println("The number is armstrong");
}
else
{
System.out.println("The number is not armstrong");
}
}