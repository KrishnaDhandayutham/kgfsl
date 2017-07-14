package com.mycompany.app.csvbeann;
import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

class OpenCSVLineReader2POJO {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("D://manish//my-app//src//main//java//com//mycompany//app//csvbeann//emps.csv"));

    
List<Employee> emps = new ArrayList<Employee>();

String[] row = null;
// Looping reader
while ((row = reader.readNext()) != null) {
Employee emp = new Employee();

// New Employee Construct
emp.setId(row[0]);
emp.setName(row[1]);
emp.setAge(row[2]);
emp.setCountry(row[3]);

emps.add(emp); // ArrayList add

}
System.out.println(emps);

}
}