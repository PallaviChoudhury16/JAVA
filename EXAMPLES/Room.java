package MethodOverloading;
import java lan.std;
class Details{
    int length;
    int breadth;
    int height;
    int windows;
    int Fans;
    int doors;
    Details(int l,int b,int h,int fan,int d,int win){
length=l;
breadth=b;
height=h;

Fans=fan;
doors=d;
windows=win;
    }
void show(){
    
    System.out.println("length is"+length);
    System.out.println("breadth is"+breadth);
    System.out.println("height is"+height);
    System.out.println("number of fans"+Fans);
    System.out.println("doors"+doors);
    System.out.println("number of windows"+windows);
}
void area(){
    System.out.println("floor area is"+length*breadth);
    int wall_area=2*(length*height+breadth*height);
    System.out.println("wall area is"+wall_area);
    System.out.println("total area"+(0.2)*(wall_area));
}
}
public class Room
{
    public static void main(String[] args) 
   {
     Scanner sc=new Scanner(System.in); 
       int length=sc.nextInt();
       int breadth=sc.nextInt();
       int height=sc.nextInt();
       int Fans=sc.nextInt();
       int doors=sc.nextInt();
       int windows=sc.nextInt();
       Details d1=new Details(length, breadth,  height, Fans, doors,windows);
       d1.show();
       d1.area();
    }
}