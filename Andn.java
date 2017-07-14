package com.mycompany.app;
import java.util.function.Predicate;  
public class Andn {  
    static Boolean checkAge(int age){  
        if(  ((age<25) ^ (age==2)) && (age<45) )  
            return true;  
        else return false;  
    }  
    public static void main(String[] args){  
        Predicate<Integer> pre =  Andn::checkAge;  
        boolean result = pre.test(2);  
        System.out.println(result);  
    }  
}  
