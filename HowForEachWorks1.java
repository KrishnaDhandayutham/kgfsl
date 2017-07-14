package com.mycompany.app;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class HowForEachWorks1 {
public static void main(String[] args) {
ArrayList list1=new ArrayList();
List<Integer> numberList = Arrays.asList(00, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
for (Integer i:  numberList) {
if ((i & 4)==0) {
System.out.println(i);
}
}
}
}
