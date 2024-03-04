class Cale
{
   public static void main(String args[])
   {
     if(args.length!=3)
      {
        System.out.println("Usage:int1 to int2");
        System.exit(0);
      }
     k1=Integer.parseInt(args[0]);
     k2=Integer.parseInt(args[2]);
     if(args[1].equals("+"));
     result=k1+k2;
     elseif(args[1].equals("-"));
     result=k1-k2;
     elseif(args[1].equals("*"));
     result=k1*k2;
     elseif(args[1].equals("/"));
     result=k1/k2;
     elseif(args[1].equals("%"));
     result=k1%k2;
     else
     {
       System.out.println("Unknown operator" +args[1]);
       System.exit(0);
     }
     System.out.println(args[0] +" " +args[1] +" " +args[2] + "=" +result);
   }
}