//creating thread by implementing Runnable thread
class NewThread implements Runnable {
    Thread t;
    NewThread(String name) {
       t = new Thread(this,name);
       System.out.println(t);
       t.start();   
    }
    public void run() {
      try {
         for(int i = 5; i >= 1; i --)
               System.out.println(i);
               t.sleep(1000);
      }
      catch(InterruptedException e) {} 
    }
}

public class ThreadByRunnable {
    public static void main(String args[]) {
        try {
              new NewThread("New_thread");
              for(int i = 1; i <= 5; i++) {
                       System.out.println(i);
                      Thread.sleep(1000);
             }
        }
        catch( InterruptedException e) {}
    }
}