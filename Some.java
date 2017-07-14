class Some implements Runnable{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  Some t1=new Some();  
  Thread t1 = new Thread();
  Some t2=new Some();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
  System.out.println("id of t1:"+t1.getId());  
  
  t1.start();  
  t2.start();  
  
  t1.setName("Sonoo Jaiswal");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  