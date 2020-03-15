package com.epam.Creational_Design_Pattern.Prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Class2_Prototype_Main_Method {
    public  static void main(String args[]) throws IOException { BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int eid=sc.nextInt();
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename=br.readLine();
        System.out.print("\n");

        System.out.println("Enter Employee Department(CSE,ECE,CIVIL)");
        String edept=br.readLine();
        System.out.print("\n");
        Class1_Prototype class1Prototype =new Class1_Prototype(eid,ename,edept);
        class1Prototype.show();
        System.out.println("\n");
        Class1_Prototype e2=(Class1_Prototype) class1Prototype.getClone();
        e2.show();




    }
}
