package com.mycompany.app.csv2bean;
import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
//import com.opencsv.bean.HeaderColumnNameMappingStrategy;
public class Csvbean {

	public List<Csvpojo> getList() throws IOException{
		
		CSVReader read= new CSVReader(new FileReader("D://manish//my-app//src//main//java//com//mycompany//app//csv2bean//manish.csv"), ',');
		//HeaderColumnNameMappingStrategy<Csvpojo> bean = new HeaderColumnNameMappingStrategy<Csvpojo>();
		ColumnPositionMappingStrategy<Csvpojo> beanStrategy = new ColumnPositionMappingStrategy<Csvpojo>();
		//bean.setType(Csvpojo.class);
		beanStrategy.setType(Csvpojo.class);
		beanStrategy.setColumnMapping(new String[] {"Id","Name","Company"});	
		CsvToBean<Csvpojo> csvToBean = new CsvToBean<Csvpojo>();
		
		List<Csvpojo> emps = csvToBean.parse(beanStrategy, read);
		
		
		System.out.println(emps);
		 return emps;
         
		
	}
	
}