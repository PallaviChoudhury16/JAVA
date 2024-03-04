import java.util.*;
class Animal 
{
    protected String name;

    public Animal(String name) 
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("I am an animal named " + name);
    }
}

class Man extends Animal 
{
    private String gender;

    public Man(String name, String gender) 
    {
        super(name);
        this.gender = gender;
    }

    public Man(String name) 
    {
        this(name, "Male");
    }

    public void show() 
    {
        System.out.println("I am a girl named " + name + ", and I am " + gender);
    }
}

class Dog extends Animal 
{
   private String breed;

    public Dog(String name, String breed) 
    {
        super(name);
        this.breed = breed;
    }

    public Dog(String name) 
    {
        this(name, "Unknown");
    }
    public void show()
    {
        System.out.println("I am a dog named " + name + ", and I am of breed " + breed);
    }
}

class Elephant extends Animal 
{
    private String size;

    public Elephant(String name, String size) 
    {
        super(name);
        this.size = size;
    }
    public Elephant(String name) 
    {
        this(name, "Huge");
    }
    public void show()
    {
        System.out.println("I am an elephant named " + name + ", and I am " + size);
    }
}

class Rabbit extends Animal 
{
    private String color;

    public Rabbit(String name, String color) 
    {
        super(name);
        this.color = color;
    }

    public Rabbit(String name) 
    {
        this(name, "White");
    }

    public void show() 
    {
        System.out.println("I am a rabbit named " + name + ", and I am " + color);
    }
}

class Main 
{
    public static void main(String[] args) 
      {
        Man man = new Man("Mona", "Female");
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Elephant elephant = new Elephant("Ellie", "Huge");
        Rabbit rabbit = new Rabbit("Thumper");
        man.show();
        dog.show();
        elephant.show();
        rabbit.show();
    }
}