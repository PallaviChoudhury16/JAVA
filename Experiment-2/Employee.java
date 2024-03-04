import java.util.Scanner;
class Employee
{
    public static void main(String args[])
    {
     String name,department;
     int age;
     float basic_salary,pf;
     char gender;
     System.out.println("Enter your name");
     Scanner sc=new Scanner(System.in);
     name=sc.next();
     System.out.println("Enter your department");
     department=sc.next();
     System.out.println("Enter  your age");
     age=sc.nextInt();
     System.out.println("Enter your basic_salary");
     basic_salary=sc.nextFloat();
     pf=(basic_salary*12)/100;
     System.out.println("Enter your gender");
     gender=sc.next().charAt(0);
      System.out.println("Name="  +name);
       System.out.println("Department=" +department);
         System.out.println("Age=" +age);
        System.out.println("Basic_salary=" +basic_salary);
         System.out.println("Pf=" +pf);
          System.out.println("Gender=" +gender);
    }
}
     
