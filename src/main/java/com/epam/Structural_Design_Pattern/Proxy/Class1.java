package com.epam.Structural_Design_Pattern.Proxy;

public class Class1 implements Proxy {
    private String name;
    Class1()
    {
    }
  public  Class1(String name)
    {
        this.name=name;
    }

    @Override
    public void printName() {
        System.out.println("Name -> "+name);
    }
}
