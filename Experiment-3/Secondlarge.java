import java.util.*;
class Secondlarge
{
    public static void main(String args[])
   {
     int i,n,j,temp;
      System.out.println("Enter the numbers to be stored in the array:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter the numbers");
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
           {
              if(arr[i]>arr[j])
               {
                 temp=arr[i];
                 arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
         }
    System.out.println("The second largest element is:" +arr[n-2]);
  }
}
