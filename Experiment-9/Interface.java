interface Interface1 
{
    default void method1() 
    {
        System.out.println("Method 1 from Interface1");
    }
}

interface Interface2 
{
    default void method2() 
    {
        System.out.println("Method 2 from Interface2");
    }
}

class MyClass implements Interface1, Interface2 
{
    public void method1() 
    {
        System.out.println("Overridden Method 1 in MyClass");
    }
}

public class Interface
{
    public static void main(String[] args) 
    {
        MyClass myObject = new MyClass();
        myObject.method1();
        myObject.method2();
}
}