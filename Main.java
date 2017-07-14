class Main
{
public static void main(String args[])
{  
  Threadfile t1=new Threadfile();  
  Threadfile t2=new Threadfile();  
   
  t1.start();  
  t2.start();  
 }
}