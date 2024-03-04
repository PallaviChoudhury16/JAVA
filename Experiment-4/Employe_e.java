import java.util.*;
public class Employe_e
{
    int emp_id; 
    String name,qualification;
    void input ()
    {
        Scanner sc1 = new Scanner(System.in);
        emp_id = sc1.nextInt();
        name = sc1.next();
        qualification = sc1.next();
    }
    void show()
    {
        System.out.println("Employee Id: "+emp_id);
        System.out.println("Name: "+name);
        System.out.println("Qualification: "+qualification);
    }
}
class Employee1
{
    public static void main(String[] args) 
    {
       Employe_e e1 = new Employe_e();
       System.out.println("Enter your emp_id,name and qualification");
       e1.input();
       System.out.println("Employee Details:");
       e1.show();
   }
}