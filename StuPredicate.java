package com.mycompany.app.kiisha;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.lang.*;
public class StuPredicate
{
 public static Predicate<Student> isDep(String dep)
 {
     return k -> k.getDep() == dep;
 }
 public static Predicate<Student> isRoll(int roll,int rollno)
 {
     return k -> k.getRollnum()>=roll && k.getRollnum()<=rollno;
 }
 public static List<Student> filterStudents(List<Student> lis,Predicate<Student> pre)
 {
     return lis.stream().filter(pre).collect(Collectors.<Student>toList());
 }
 
}