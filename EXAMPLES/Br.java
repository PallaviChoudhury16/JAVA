import java.io.*;
public class Br
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value for a: ");
        a=Intger.parseInt(br.readLine());
        System.out.println("Enter a valuefor b: ");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("Sum of two number is: "+c);
    }
}