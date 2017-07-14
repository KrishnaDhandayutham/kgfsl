package com.mycompany.app;
import com.opencsv.CSVReader;
import java.io.*;
public class Csv
{
    public static void main(String args[]) throws IOException
    {
    String csvFilename="D:\\manish\\my-app\\src\\main\\java\\com\\mycompany\\app\\manish.csv";
    CSVReader cr= new CSVReader(new FileReader(csvFilename));
    String[] row=null;
    while(( row = cr.readNext())!=null)
    {
        System.out.println(row[0]
                         + "#"+row[1]
                         +"#"+row[2]);
    }
    cr.close();
    }
}