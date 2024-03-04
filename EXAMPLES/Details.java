class Details
{
   int rollno;
   String name;
   static String college="GIET";
   Details(int r,int n)
  {
   rollno=r;
   name=n;
  }
 void display()
  {
    System.out.println(rollno + ""+name+" "+college);
  }
}
class Staticmethod
{
  static
   {
    System.out.println("static block is executed");
   } 
    public static void main(String args[])
  {
    Details d1=new Details(1,"Pallavi");
    Details d2=new Details(2,"Pallavi");
    d1.display();
    d2.display();
  }
}

