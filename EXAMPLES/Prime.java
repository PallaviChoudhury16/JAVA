import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        int i,c=0,no;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
             System.out.println("it is a prime number");
         }
        else
        {
            System.out.println("it is not a prime number");
        }
    }
}