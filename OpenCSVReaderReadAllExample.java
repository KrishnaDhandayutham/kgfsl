package com.mycompany.app;

import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;

public class OpenCSVReaderReadAllExample {

	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("dd.csv"), ',');

		List<Employee> emps = new ArrayList<Employee>();

		List<String[]> records = reader.readAll();

		Iterator<String[]> iterator = records.iterator();

		while (iterator.hasNext()) {
			String[] record = iterator.next();
			emps.add(new Employee().setId(record[0]).setName(record[1]).setAge(record[2]).setCountry(record[3]));
		}

		System.out.println(emps);

		reader.close();
	}
}