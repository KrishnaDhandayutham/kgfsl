package com.mycompany.app.csv2bean;
import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;
public class Csvopen{
     static List<String> read() throws IOException
     {
         CSVReader r = new CSVReader(new FileReader("D://manish//my-app//src//main//java//com//mycompany//app//csv2bean//manish.csv"));
        List<String[]> t1= r.readAll();
        int i=0;
        while(i<t1.size())
        {
            System.out.println(Arrays.toString(t1.get(i)));
            i++;
            return t1;
        }
     }
    public static void main(String[] args) throws IOException {
       read();
        
       /* List<Csvpojo> po =new ArrayList<Csvpojo>();
        String[] record=null;
        while((record=r.readNext())!=null)
        {
             Csvpojo cspo = new Csvpojo();
             cspo.setId(record[0]);
             cspo.setName(record[1]);
             cspo.setCompany(record[2]);
             po.add(cspo);
        }
        System.out.println(po);*/
        //r.close();
    }
}