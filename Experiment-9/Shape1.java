import java.util.*;
abstract class Shape
{
   abstract double CalculateArea();
   abstract double CalculateVolume();
}
class Sphere extends Shape
{
   double radius;
   Sphere(double radius)
   {
      this.radius = radius;
   }
   double CalculateArea()
   {
      return 4 * Math.PI * Math.pow(radius, 2);
   }
   double CalculateVolume()
   {
      return (4.0 / 3) * Math.PI * Math.pow(radius, 3); 
   }
}
class Cone extends Shape
{
   double radius, height;
   Cone(double radius,double height)
   {
       this.radius = radius;
       this.height = height; 
   }
   double CalculateArea()
   {
      return ( Math.PI * radius *radius) + ( Math.PI * radius * Math.sqrt((radius * radius) + (height * height)));
   }
   double CalculateVolume()
   {
      return (Math.PI * radius * radius * height)/3;
   }
}
class Cylinder extends Shape
{
   double radius,height;
   Cylinder(double radius,double height)
   {
      this.radius = radius;
      this.height = height;
   }
   double CalculateArea()
   {
      return 2 * Math.PI * radius * (radius + height);
   }
   double CalculateVolume()
   {
       return Math.PI * Math.pow(radius, 2) * height;
   }
}
class Box extends Shape
{
   double length,breadth,height;
   Box(double length,double breadth,double height)
   {
      this.length = length;
      this.breadth = breadth;
      this.height = height;
   }
   double CalculateArea()
   {
      return 2*(length * breadth + breadth * height + height * length);
   }
   double CalculateVolume()
   {
      return length * breadth * height;
   }
}
class Shapee
{
   public static void main(String args[])
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere: ");
        double SR = scanner.nextDouble();
        Sphere sphere = new Sphere(SR);
        System.out.println("Enter the radius of the cone: ");
        double C1R = scanner.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double C1H = scanner.nextDouble();
        Cone cone = new Cone(C1R , C1H);
        System.out.print("Enter the radius of the Cylinder: ");
        double CR = scanner.nextDouble();
        System.out.print("Enter the height of the Cylinder: ");
        double CH = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(CR, CH);
        System.out.print("Enter the length of the Box: ");
        double BL = scanner.nextDouble();
        System.out.print("Enter the breadth of the Box: ");
        double BB = scanner.nextDouble();
        System.out.print("Enter the height of the Box: ");
        double BH = scanner.nextDouble();
        Box box = new Box(BL, BB, BH);
        System.out.println("Area of the Sphere is: " + sphere.CalculateArea());
        System.out.println("Volume of the Sphere is: " +sphere.CalculateVolume());
        System.out.println("Area of the Cone is: " + cone.CalculateArea());
        System.out.println("Volume of the Cone is: " +cone.CalculateVolume());
        System.out.println("Area of the Cylinder is: " + cylinder.CalculateArea());
        System.out.println("Volume of the Sphere is: " + cylinder.CalculateVolume());
        System.out.println("Area of the Box is: " + box.CalculateArea());
        System.out.println("Volume of the Box is: " +box.CalculateVolume());
}
}