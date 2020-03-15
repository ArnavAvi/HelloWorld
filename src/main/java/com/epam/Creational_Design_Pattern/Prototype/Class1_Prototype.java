package com.epam.Creational_Design_Pattern.Prototype;

public class Class1_Prototype implements Prototype {
    private int id;
    private String name,dept;
    Class1_Prototype()
    {
      System.out.format("%s","Deatils of Employees");
    }
    Class1_Prototype(int id, String name, String dept)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    public void show()
    {
        System.out.println(id+"\t"+name+"\t"+dept);
    }

    @Override
    public Prototype getClone() {
        return new Class1_Prototype(id,name,dept);
    }
}
