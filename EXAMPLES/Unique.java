public class Unique
{
    public static void main(String args[])
    {
        int n,count=0,i,j,k;
        System.out.println("Unique three digit number 1,2,3,and 4: ");
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                for(k=1;k<=4;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                        n=i*100+j*10+k;
                        System.out.println(n);
                        count++;
                    }
                }
            }
        }
        System.out.println("total Number" +count);
    }
}