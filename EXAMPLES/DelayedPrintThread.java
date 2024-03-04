public class DelayedPrintThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(i);
            if (i == 5) 
            {
                try 
                {
                    Thread.sleep(5000); 
                }
                catch (InterruptedException e) 
                {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        DelayedPrintThread delayedPrintThread = new DelayedPrintThread();
        delayedPrintThread.start();
        try 
        {
           delayedPrintThread.join();
        }
         catch (InterruptedException e)

        {
            System.out.println(e);
        }

        System.out.println("Thread finished.");
}
}