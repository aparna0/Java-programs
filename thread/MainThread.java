
public class MainThread {
   public static void main(String args[]) {
      try{
           for(int i = 1; i <= 5; i++) {
              
                // Accessing  main thread
                System.out.println(i);
                Thread.sleep(1000);
           }
           // creating thread using main thread
           Thread t = Thread.currentThread();
            System.out.println(t);
            t.setName("new thread");
            System.out.println(t);
      }
      catch(InterruptedException e) { } 
   }
}
