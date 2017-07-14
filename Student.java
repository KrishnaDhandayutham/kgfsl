package com.mycompany.app.kiisha;
public class Student
{
    public Student(int rollnum,int idnum,String name,String dep)
    {
        this.rollnum=rollnum;
        this.idnum=idnum;
        this.name=name;
        this.dep=dep;
    }
private int rollnum;
private int idnum;
private String name;
private String dep;
public void setRollnum(int rollnum)
{
    this.rollnum=rollnum;
}
public int getRollnum()
{
    return rollnum;
}
public void setIdnum(int idnum)
{
    this.idnum=idnum;
}
public int getIdnum()
{
    return idnum;
}
public void setName(String name)
{
    this.name=name;
}
public String getName()
{
    return name;
}
public void setDep(String dep)
{
    this.dep=dep;
}
public String getDep()
{
    return dep;
}
public String toString()
{
    return rollnum + "" + idnum + "" + name + "" + dep;
}
}