package com.module1;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        //Take student details input
        //Student name:
        //USN:
        //Branch:
        //Age

        //Steps-1: print statement asking for input
        //Step-2: create variable and store I/P data using in-built methods
        //Step-3:
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Student name: ");
        String name=s.next();
        System.out.println("Enter the USN: ");
        String usn=s.next();
        System.out.println("Enter Age: ");
        int age=s.nextInt();
        System.out.println("Enter the branch: ");
        String branch=s.next();

        System.out.println("Name: "+name);
        System.out.println("Usn: "+usn);
        System.out.println("Age: "+age);
        System.out.println("Branch: "+branch);

    }
}
