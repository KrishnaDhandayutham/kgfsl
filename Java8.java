package com.mycompany.app;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8{
   public static void main(String args[]){
   
      List<String> names1 = new ArrayList<String>();
      names1.add("Mahesh ");
      names1.add("Suresh ");
      names1.add("Ramesh ");
      names1.add("manisha ");
      names1.add("Kalpesh ");
		
      List<String> names2 = new ArrayList<String>();
      names2.add("Zahesh ");
      names2.add("Suresh ");
      names2.add("manisha ");
      names2.add("Naresh ");
      names2.add("krishna ");
		
   //   Java8 tester = new Java8();
     System.out.println("Sort using Java 7 syntax: ");
		
     /* sortUsingJava7(names2);
      System.out.println(names2);
      System.out.println("Sort using Java 8 syntax: ");*/
		
      sortUsingJava8(names2);
      System.out.println(names2);
   }
   
  /* //sort using java 7
   static void sortUsingJava7(List<String> names){   
      Collections.sort(names, new Comparator<String>() {
         @Override
         public int compare(String s1, String s2) {
            return s1.compareTo(s2);
         }
      });
}*/
   
  // sortusingjava 8
    static void sortUsingJava8(List<String> names){
      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
}
}
