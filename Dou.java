package com.mycompany.app;
import java.util.*;
import java.util.function.Function;
class Dou
{
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(10,20,3,04,0,60,6,708,0402,4);
        List<Double> dn = Dou.func(in,Double::new);
        System.out.println(dn);    
    }
    public static List<Double> func(List<Integer> list,Function<Integer,Double> function)
    {
        List<Double> reut = new ArrayList<>();
        list.forEach(x->reut.add(function.apply(x)));
        return reut;
    }
}
