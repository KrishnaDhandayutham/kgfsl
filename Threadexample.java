class Threadexample extends Thread
{
   public void run()
   {

         try{  
    Thread.sleep(100);  
   }catch(Exception e){System.out.println(e);}  
         System.out.println("Thread running"+Thread.currentThread().getName());
         System.out.println("Thread running"+Thread.currentThread().getPriority());
   }
   public static void main(String[] args) {
         Threadexample t1 = new Threadexample();
         Threadexample t2 = new Threadexample();
         Threadexample t3 = new Threadexample();
         System.out.println(t1.getName());
         System.out.println(t2.getName());
         System.out.println(t3.getName());
         System.out.println(t2.getId());
          t1.setPriority(Thread.MIN_PRIORITY);
          t2.setPriority(Thread.MAX_PRIORITY);
         t1.start();
         t2.start();
         t3.start();
         t2.setName("manis");
         System.out.println("After settting "+ t2.getName());
   }
}