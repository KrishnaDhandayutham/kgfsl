public class Threadgroupexmp implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      Threadgroupexmp r = new Threadgroupexmp();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(tg1, r,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, r,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, r ,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
         tg1.list();  
  
    }  
   }  