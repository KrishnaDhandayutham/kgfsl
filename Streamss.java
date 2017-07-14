package com.mycompany.app.java8;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;
import java.lang.*;
 class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Streamss
{
   
    static public void main(String... z)
    {
          List<Product> s = new ArrayList<Product>();
          s.add(new Product(10,"Nokia",50000f));
          s.add(new Product(20,"Vivo",90000f));
          double list=s.stream().collect(Collectors.summingDouble(Product->Product.price));
          System.out.println(list);
          Product pb = s.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
          System.out.println(pb.price);
          Stream<Integer> st = Stream.of(3,45,5,6);
          Optional<Integer> op = st.collect(Collectors.minBy(Comparator.reverseOrder()));
          if(op.isPresent())
          {
              System.out.println(op.get());
          }
    }
}