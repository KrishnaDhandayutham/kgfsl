package com.mycompany.app;
import java.util.Scanner;
import java.io.*;
interface Operation{
int operation(int a,int b);
}
interface NameString{
String namestring(String name);
}
public class MsgPass{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
while(true)
{
System.out.println("First Number");
int value1=scan.nextInt();
System.out.println("Second Number is less then "+value1);
int value2=scan.nextInt();
System.out.println("Your Name");
String stringname=scan.next();
if(value2>value1)
{
System.out.println("Read the instruction Clearly,your second number is greater then first number, "+stringname);
break;
}

Operation add=(a,b)->a+b;;;;;;;;;;;;
Operation sub=(a,b)->a-b;
Operation mul=(a,b)->a*b;
NameString name=(namee)->namee;
System.out.println("Your Answer");
System.out.println(value1+"+"+ value2 +"="+add.operation(value1,value2));
System.out.println(value1+"-"+ value2 +"="+sub.operation(value1,value2));
System.out.println(value1+"*"+ value2 +"="+mul.operation(value1,value2));
System.out.println("Naa Dhan "+name.namestring(stringname));
break;
/*NameString object1 = n->System.out.println("Hello " + n);
 object1.namestring("Poovarasan");*/
}
}
}