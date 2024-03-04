public class Multiple
{
    public static void main(String args[])
    {
        try
        {
            int arr[]={1,2,3,4};
            int a[]=new int[5];
            a[5]=50/0;
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Hello world");
        }
        catch(ArithmeticException e)
        {
            System.out.println("java");
        }
        catch(Exception e)
        {
            System.out.println("pallavi");
        }
        System.out.println("succefully excute");
    }
}