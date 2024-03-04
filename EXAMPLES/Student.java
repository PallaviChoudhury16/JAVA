class Student
{
    int id,age;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    Student(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println(id+ " "+name +" "+age);
    }
    public static void main(String arg[])
    {
        Student s1=new Student(106,"Purabi");
        Student s2=new Student(107,"Pallavi",19);
        s1.display();
        s2.display();
    }
}