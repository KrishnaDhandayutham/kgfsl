package com.mycompany.app.kiisha;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.*;
 
public class Studentpre {
    public static void main(String[] args){
        Student e1 = new Student(1,18831,"flowerking","CSE");
        Student e2 = new Student(2,13,"Martina","EEE");
        Student e3 = new Student(3,43,"Ricky","MCA");
        Student e4 = new Student(4,26,"Jon","MCA");
        Student e5 = new Student(5,19,"Cristine","ECE");
        Student e6 = new Student(6,15,"David","MA");
        Student e7 = new Student(7,68,"Melissa","MECH");
        Student e8 = new Student(8,79,"Alex","IT");
        Student e9 = new Student(9,15,"Neetu","EEE");
        Student e10 = new Student(10,45,"Naveen","FT");  
        List<Student> lis = new ArrayList<Student>();
        lis.addAll(Arrays.asList(new Student[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
        StuPredicate stu = new StuPredicate();       
        System.out.println(stu.filterStudents(lis, stu.isDep("EEE")));  
        System.out.println(stu.filterStudents(lis, stu.isRoll(2,7)));
    }
}