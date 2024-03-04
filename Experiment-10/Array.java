public class Array
{
    public static void main(String args[])
    {
        try
        {
            int arr[]={2,4,6,8,10};
            System.out.println(arr[10]);
        }
            
               catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
                System.out.println("Hello");
    }
}