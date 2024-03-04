import java.util.*;
class Ascending
{
   public static void main(String args[])
   {
     int no,i,j,temp;
     System.out.println("Enter the number to be stored in the array:");
     Scanner sc=new Scanner(System.in);
     no=sc.nextInt();
     int arr[]=new int[no];
     System.out.println("Enterthe elements");
     for(i=0;i<no;i++)
     {
       arr[i]=sc.nextInt();
     }
     for(i=0;i<no;i++)
      {
        for(j=i+1;j<no;j++)
        {
          if(arr[i]>arr[j])
         {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
       }
    }
System.out.println("Ascending orderis:");
for(i=0;i<no-1;i++)
  {
  System.out.println(arr[i] + ",");
  }
System.out.println(arr[no-1]);
 }
} 

 