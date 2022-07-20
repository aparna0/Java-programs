//creating thread by extending Thread class
class NewThread extends Thread {
   String name;
   NewThread( String str) {
         super(str);
         this.name = str;
         start();
  }
  public void run() {
     try{
        for(int i =5; i >= 1; i--) {
             System.out.println(this.name+" : "+ i);
             Thread.sleep(1000);
        }
     }
     catch(InterruptedException e) { }
  }
}

public class ThreadByExtendingThread {
     public static void main(String args[]) {
         try {
                new NewThread("new thread1");
                 new NewThread("new thread2");
                  new NewThread("new thread3");
                 for(int i = 1; i <= 5; i++) {
                      System.out.println("main thread : "+ i);
                      Thread.sleep(1000);
                 }
         }
         catch(InterruptedException e) { }
     }
}
/* 
main thread : 1
new thread3 : 5
new thread2 : 5
new thread1 : 5
main thread : 2
new thread2 : 4
new thread1 : 4
new thread3 : 4
new thread3 : 3
main thread : 3
new thread1 : 3
new thread2 : 3
new thread1 : 2
main thread : 4
new thread3 : 2
new thread2 : 2
new thread2 : 1
new thread1 : 1
main thread : 5
new thread3 : 1
*/