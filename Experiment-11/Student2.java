package p1;
public class Student2
{
    int rollno; 
    String name,branch;
    public void getdata(int r,String s, String b)
    {
        rollno=r;  
        name=s; 
        branch=b;  
    }
    public void putdata()
    {
       System.out.println("Rollno = " +rollno); 
       System.out.println("Name = " + name); 
       System.out.println("Branch = " + brnch);
    }
}
