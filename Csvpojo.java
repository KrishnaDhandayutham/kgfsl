package com.mycompany.app.csv2bean;

public class Csvpojo
{
 String Id;
 String Name;
 String Company;

 /*public String getId()
{
    return Id;
}*/
public void setId(String Id)
{
    this.Id=Id;
}
/*public String getName()
{
    return Name;
}*/
public void setName(String Name)
{
    this.Name=Name;
}
/*public String getCompany()
{
    return Company;
}*/
public void setCompany(String Company)
{
    this.Company=Company;
}
public String toString()
{
return "ID-"+Id+":"+Name+":"+Company;
}
}
