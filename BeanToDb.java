package com.mycompany.app.csv2bean;
import com.opencsv.bean.CsvToBean;
import java.io.*;
import java.sql.*;
import java.util.*;
class BeanToDb
{
    static Connection con=null;
    static boolean isSuccess= true;
    static String query="";
    public static void main(String[] args) throws IOException
    {
        Csvbean cbn=new Csvbean();
        List<Csvpojo> em=new ArrayList<Csvpojo>();
        em=cbn.getList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/preactice","root","");
    }
            
         catch (Exception e) {
             e.printStackTrace();
           
} 
if (con!=null)
{
    System.out.println("Conncetion Established");
    try {
        for(Csvpojo p:em)
        {
        query = "INSERT INTO `preactice` (`Id`, `Name`, `Company`) VALUES (\"" + p.Id
							+ "\", \"" +p.Name+ "\", \"" + p.Company + "\");";
        
        
        
        isSuccess &= (con.prepareStatement(query).executeUpdate() > 0);
        }
    } catch (Exception e) {
      e.printStackTrace();
    }
}
if(isSuccess)
{
    System.out.println("insetred");
}
else
{
    System.out.println("failed");
}
}
}  