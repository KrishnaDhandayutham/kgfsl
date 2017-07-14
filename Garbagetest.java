public class Garbagetest{

 public void finalize(){System.out.println("object is garbage collected");}
 public void display()
 {
     System.out.println("heloo");
 }
 public static void main(String args[]){
  Garbagetest s1=new Garbagetest();
  Garbagetest s2=new Garbagetest();
  s1.display();
  s2.display();
  s1=null;
  System.gc();
 }
}
