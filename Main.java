package com.company;
import java.util.Scanner;
import java.lang.System;
public class Main {

    public static void main(String[] args) {

        dealership d1 = new dealership();


        d1.setLocation("");
        d1.setSellerFirstName("");
        d1.setSellerLastName("");
        d1.setBuyerFirstName("");
        d1.setBuyerLastName("");
        //d1.setdate("");
        d1.setVehicleRegistration("");
        System.out.println("Location: " + d1.getLocation());
        System.out.println("Sellers First Name:" + d1.getSellerFirstName());
        System.out.println("Sellers Last Name:" + d1.getSellerLastName());
        System.out.println("Buyers First Name:" + d1.getBuyerFirstName());
        System.out.println("Buyers Last Name:" + d1.getBuyerLastName());
        //System.out.println("Date :" + d1.getdate());
        System.out.println("Vehicle Registration:" + d1.getVehicleRegistration());



        SalesLead s1 = new SalesLead();
        s1.setsalesLeadID("");
        System.out.println(s1.getsalesLeadID());
        s1.setsalesLeadFirstName("");
        s1.setsalesLeadLastName("");
        String customer = (s1.getsalesLeadFirstName()+" " +s1.getsalesLeadLastName());
        s1.setSalesLeadNumber("");
        SalesLead lead1 = new SalesLead();
        lead1.setsalesLeadFirstName("");
        lead1.setsalesLeadLastName("");
        lead1.setsalesLeadID("");
        lead1.setSalesLeadeMail("");
        System.out.println("First Name:" + lead1.getsalesLeadFirstName());
        System.out.println("Last Name:" + lead1.getsalesLeadLastName());
        System.out.println("Sales Lead Number:" + s1.getsalesLeadNumber());
        System.out.println("Sales Lead ID:" + lead1.getsalesLeadID());
        System.out.println("Sales Lead Mail:" + lead1.getSalesLeadeMail());



        Customer c1 = new Customer();
        c1.setFirstName(" ");
        c1.setLastName("");
        c1.setPhone("");
        c1.setAddress("");
        c1.setEmail("");




        System.out.println("First Name: " + c1.getFirstName());
        System.out.println("Last Name: " + c1.getLastName());
        System.out.println("Phone: " + c1.getPhone());
        System.out.println("Address: " + c1.getAddress());
        System.out.println("Email: " + c1.getEmail());



        SalePersons salesPer1 = new SalePersons();
        salesPer1.setName("");
        salesPer1.setEmail("");
        salesPer1.setAddress("");
        salesPer1.setEmployeeID("");
        salesPer1.setContactNumber("");
        System.out.println("Name:" + salesPer1.getName());
        System.out.println("Email:" + salesPer1.getEmail());
        System.out.println("Address:" + salesPer1.getAddress());
        System.out.println("EmployeeID:" + salesPer1.getEmployeeID());
        System.out.println("Contact Number:" + salesPer1.getContactNumber());

        Parts tool = new Parts();
        tool.setPartName("");
        tool.setPartType("");
        tool.setPartID();
        System.out.println(" Part Name:" + tool.getPartName());
        System.out.println(" Part Type:" + tool.getPartType());
        System.out.println(" Part ID:" + tool.getPartID());

    }
}
