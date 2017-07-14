package com.mycompany.app;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Product{  
    public static void main(String[] args) {  
        List<Product1> list=new ArrayList<Product1>();  
          
        //Adding Products  
        list.add(new Product1(1 ," HP  " , 25000f));  
        list.add(new Product1(3 ," Acer " , 300f));  
        list.add(new Product1(2 ," Dell Mouse " , 150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        //for(Product1 p:list){  
        //    System.out.println(p.id+" "+p.name+" "+p.price);  
       // }  
       list.forEach((n)->System.out.println( n.id+""+n.name+""+n.price) );
  
    }  
}  
