package com.mycompany.app;
import java.util.*;
public class Javademo
{
    public void get()
    {
        List<String> n1 = new ArrayList<String>();
        n1.add("Naren");
        n1.add("Karthik");
        n1.add("Manisha");
        n1.add("Krishna");
         System.out.println(n1);
         System.out.println("Sort using Java 8 syntax: ");
    }
    public static void main(String[] args) {
        Javademo j1 = new Javademo();
        j1.get();
        
    }

}