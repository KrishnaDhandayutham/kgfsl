package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

class Pre {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        num.forEach(System.out::println);
        List<Integer> evenNum=Pre.testPredicate(num,x->Pre.IsEvenNumber(x));
        //List<Integer> evenNum= Pre.testPredicate(num, Pre::IsEvenNumber);
        System.out.println(evenNum);
    }

    public static boolean IsEvenNumber(Integer x) {
        return (x & 1) == 0;
    }

    public static List<Integer> testPredicate(List<Integer> l, Predicate<Integer> pre) {
        List<Integer> retu = new ArrayList<>();
        for (Integer x : l) {
            if (pre.test(x))
                retu.add(x);
        }
        return retu;
    }
}