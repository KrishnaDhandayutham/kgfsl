package com.mycompany.app.csv2bean;
import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;
public class Csvreaderopen{
    public static void main(String[] args) throws IOException {
        CSVReader read = new CSVReader(new FileReader("D://manish//my-app//src//main//java//com//mycompany//app//csv2bean//manish.csv"));
        List<Csvpojo> po =new ArrayList<Csvpojo>();
        String[] record=null;
        while((record=read.readNext())!=null)
        {
             Csvpojo cspo = new Csvpojo();
             cspo.setId(record[0]);
             cspo.setName(record[1]);
             cspo.setCompany(record[2]);
             po.add(cspo);
        }
        System.out.println(po);
        read.close();
    }
}