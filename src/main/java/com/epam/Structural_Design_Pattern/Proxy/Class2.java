package com.epam.Structural_Design_Pattern.Proxy;

public class Class2 implements Proxy {
    private Class1 class1;
    private String name;
    public Class2(String name)
    {
        this.name=name;
    }

    @Override
    public void printName() {
        if(class1==null)
        {
            class1=new Class1(name);
        }
        class1.printName();

    }
}
