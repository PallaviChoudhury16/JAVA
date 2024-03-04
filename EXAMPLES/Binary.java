import java.util.*;
public class Binary
{
    public static void main(String args[])
    [
        String b;
        System.out.println("Enter a Binary number: ");
        Scanner sc =new Scanner(System.in);
        b=sc.nextLine();
        try
        {
            int d=Integer.parseInt(b,2);
            System.out.println("Decimal number: " +d);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("Invalid Binarynumber: ");
        }
    ]
}