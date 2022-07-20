// creating Thread  by exending Thread class and assigning priority

class NewThread extends Thread {
  String name ;
  int priority; 
  NewThread(String n, int pr) {
        super(n);
        this.setPriority(pr);
        name = n;
        priority = pr;
        start();
  }
  public void run() {
   try {
       System.out.println("name : "+ name + "priority : " + this.getPriority());
       for(int i = 1; i <= 3 ; i ++) {
             System.out.println(name +" : " + i);
             Thread.sleep(1000);
       }
  } 
   catch( InterruptedException e) { }

  } 
}

public class ThreadPriority {
  public static void main(String args[]) {
         Thread t = Thread.currentThread();
         t.setPriority(Thread.MAX_PRIORITY);
       // Thread.currentThread().setPriorty(Thread.MAX_PRIORITY);
        new NewThread("thread 1",Thread.NORM_PRIORITY);
        new NewThread("thread 2",Thread.MIN_PRIORITY  );
        System.out.println(" main priority : "+ t.getPriority());
       for(int i = 1; i <= 3 ; i ++) {
      System.out.println( "main " + i);
        try {
              Thread.sleep(1000);
        }
        catch( InterruptedException e) { }
}
  }
}