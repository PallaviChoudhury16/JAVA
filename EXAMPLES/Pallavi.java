import java.io.*;
public class Pallavi
{
    public static void main(String args[])throws Exception
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value for a: ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter a value for b: ");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("Sum of two number is: "+c);
    }
}