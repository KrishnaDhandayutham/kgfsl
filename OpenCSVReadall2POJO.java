package com.mycompany.app.csvbeann;

import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

class OpenCSVReadall2POJO {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');
List<Employee> emps = new ArrayList<Employee>();

List<String[]> records = reader.readAll();

for (String[] row : records) {
Employee emp = new Employee();

emp.setId(row[0]);
emp.setName(row[1]);
emp.setAge(row[2]);
emp.setCountry(row[3]);

emps.add(emp); // ArrayList add 
}
System.out.println(emps);
}
}
