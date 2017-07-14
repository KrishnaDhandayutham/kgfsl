class Simple1 extends Thread{
public Simple1()
{
    start();
}
 public void run(){
   System.out.println("task one");
 }
}

class Simple2 extends Simple1{
 public void run(){
   System.out.println("task two");
 }
}

 class Multitask{
 public static void main(String args[]){
 // Simple1 t1=new Simple1();
  Simple1 t2=new Simple2();
  t2.run();
 }
}
