class JaggedArray
{
   public static void main(String args[])
   {
     int arr[]=new int[3][];
     arr[0]=new int[3];
     arr[1]=new int[4];
     arr[2]=new int[2];
     int count=0;
     for(inti=0;i<arr.length;i++)
      {
        for(intj=0;j<arr[i].length;j++)
         {
           arr[i][j]=count++;
         }
      }
    for(inti=0;i<arr.length;i++)
   {
     for(intj=0;j<arr[i].length;j++)
      {
        System.out.println(arr[i][j] + " ");
      }
     System.out.println();
    }
  }
}
