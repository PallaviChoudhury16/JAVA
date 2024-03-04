class Number10
{
    public static void main(String args[])
    {
        int n,i=0,j=1;
        n=Integer.parseInt(args[0]);
        System.out.println("Fiboncci series is: ");
        while(j<=n)
        {
            System.out.println(j+ " ");
            j=i+(i=j);
        }
    }
}