import java.io.FileOutputStream;
public class FileOutput
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\purab\\Desktop\\File.txt");
            fout.write(65);
            fout.close();
            System.out.println("Successfully Written");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}