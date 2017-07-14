package com.mycompany.app.csvbeann;

import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

class OpenCSVReadall{
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');
List<String[]> records = reader.readAll();
//records.forEach(System.out:rintln);

for (String[] strings : records) {
System.out.println(Arrays.toString(strings));
}

}
}
