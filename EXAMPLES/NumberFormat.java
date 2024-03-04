public class NumberFormat
{
    public static void main(String args[])
    {
        try
        {
            String st="123";
            int i=Integer.parseInt(st);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Rest of the code");
}
}
}