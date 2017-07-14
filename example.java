package com.mycompany.app.java8;
interface iname
{
    public String imethod(String s);
}

public class example
{
 public String cmethod(String a)
 {
     return a; 
 }
 public static void main(String ar[])
 {  
     String g="";
     iname i=(String)->"hi";
    System.out.println( i.imethod( g));
 }
}