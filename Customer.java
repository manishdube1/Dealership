package com.company;
import java.util.Scanner;
import java.lang.System;
public class Customer {
    private String FirstName;
    private String LastName;
    private String Address;
    private String email;
    private String phone;
    Scanner bc = new Scanner(System.in);

    // This is customer name
    public String setFirstName(String FirstName) {
        System.out.print("Please enter Customer's First Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco12 = bc.nextLine();
        System.out.println();
        this.FirstName = loco12;
        return FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String setLastName(String LastName) {
        System.out.print("Please enter Customer's Last Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco13 = bc.nextLine();
        System.out.println();
        this.LastName = loco13;
        return LastName;
    }

    public String getLastName() {
        return LastName;
    }

    //Phone
    public String setPhone(String phone) {
        System.out.print("Please enter Customer's Phone Number: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco15 = bc.nextLine();
        System.out.println();
        this.phone = loco15;
        return phone;
    }

    public String getPhone() {
        return phone;
    }

    //Address
    public String setAddress(String Address) {
        System.out.print("Please enter Customer's Address: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco16 = bc.nextLine();
        System.out.println();

        this.Address = loco16;
        return Address;
    }

    public String getAddress() {
        return Address;
    }

    //email
    public String setEmail(String email) {
        System.out.print("Please enter Customer's Email: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco17 = bc.nextLine();
        this.email = loco17;
        return email;
    }

    public String getEmail() {
        return email;
    }


}
