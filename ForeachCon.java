package com.mycompany.app;
//import com.sun.org.apache.xpath.internal.operations.And;
import java.util.*;
import java.util.function.Consumer;
import java.lang.Integer;
public class ForeachCon
{
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        mylist.add(i);
        /*Iterator<Integer> it= mylist.iterator();
        while(it.hasNext()){
        Integer i=it.next();
        System.out.println("iterator Value:"+i);
        }*/
        mylist.forEach((Consumer<Integer>)(n)->{System.out.println(n); 
        });
        Myconsumer act = new Myconsumer();
        mylist.forEach(act);
}
}
class Myconsumer implements Consumer<Integer>{
    public void accept(Integer t) {
		System.out.println("Consumer impl Value:"+t);
	}
}