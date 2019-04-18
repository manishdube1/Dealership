package com.company;
import java.util.Scanner;
import java.lang.System;
public class SalePersons {

    private String name;
    private String email;
    private String address;
    private String employeeID;
    private String contactNumber;
    Scanner cd = new Scanner(System.in);

    public String setName (String name){
        System.out.print("Please enter Sales Persons's Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco18 = cd.nextLine();
        System.out.println();
        this.name = loco18;
        return name;

    }
    public String getName(){ return name;}

    public String setEmail (String email){
        System.out.print("Please enter Sales Persons's Email: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco19 = cd.nextLine();
        System.out.println();
        this.email = loco19;
        return email;


    }
    public String getEmail(){ return email;}
    public String setAddress (String address){
        System.out.print("Please enter Sales Persons's Address: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco20 = cd.nextLine();
        System.out.println();
        this.address = loco20;
        return address;

    }
    public String getAddress(){ return address;}

    public String setEmployeeID (String employeeID){
        System.out.print("Please enter Sales Persons's Employee ID: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco21 = cd.nextLine();
        System.out.println();
        this.employeeID = loco21;
        return employeeID;

    }
    public String getEmployeeID(){ return employeeID;}

    public String setContactNumber (String contactNumber){
        System.out.print("Please enter Sales Persons's Contact Number: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco22 = cd.nextLine();
        System.out.println();
        this.contactNumber = loco22;
        return contactNumber;

    }
    public String getContactNumber(){ return contactNumber;}




}
