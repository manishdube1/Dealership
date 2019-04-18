package com.company;
import java.util.Scanner;
import java.lang.System;

public class Parts {
    private String partName;
    private String partType;
    private String partID;
    Scanner de = new Scanner(System.in);

    public String setPartName(String partName) {
        System.out.print("Please enter Part Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco23= de.nextLine();
        System.out.println();
        this.partName = loco23;
        return partName;
    }

    public String getPartName() {
        return partName;
    }

    public String setPartType(String partType) {
        System.out.print("Please enter Part Type: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco24 = de.nextLine();
        System.out.println();
        this.partType = loco24;
        return partType;
    }

    public String getPartType() {
        return partType;
    }

    public String setPartID() {
        System.out.print("Please enter Part ID: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco25 = de.nextLine();
        System.out.println();
        this.partID = loco25;
        return partID;
    }

    public String getPartID() {
        return  partID;

    }
}
