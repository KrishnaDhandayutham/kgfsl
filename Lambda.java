package com.mycompany.app;
import java.util.*;
public class Lambda 
{
         public static void get() {
            List<String> li = new ArrayList<String>();
            li.add("manisha");
            li.add("EEE");
            li.add("KIOT");
            li.forEach((n)->System.out.println(n) );
             //li.forEach(System.out::println)
             //System.out.println(li);
         }
         public static void main(String[] args) {
         Runnable r2=()->{
             //Lambda l1 = new Lambda();
            System.out.println("thread1 is running");
              get();
         };
         Thread t1 = new Thread(r2);         
         t1.start();
         }
}
