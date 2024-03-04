import java.util.*;
public class Person
{
   void display()
  {
    System.out.println("the details of students are");
  }
}
class Student extends Person
{
   int reg;
   int roll;
   String name;
   String branch;
   Student(int reg,int roll,String name,String branch)
   {
      this.reg=reg;
      this.roll=roll;
      this.name=name;
      this.branch=branch;
   }
void print()
   {
     super.display();
     System.out.println("reg="+reg);
     System.out.println("roll="+roll);
     System.out.println("name="+name);
     System.out.println("branch="+branch);
   }
}
class Main
  {
     public static void main(String[] args)
      {
        Student s1=new Student(1001,01,"pallavi","cse");
        s1.print();
      }
 }