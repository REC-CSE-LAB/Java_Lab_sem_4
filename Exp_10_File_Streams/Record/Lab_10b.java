//  Aim: b) Write a program that reads grades of type double of eight
//          students that the user provides. The grades lie between 0
//          and 10. These grades should be written to a binary file and
//          read from it. The program outputs the highest and lowest grades
//          achieved by students on the screen. The file contains nothing
//          but numbers of type double written to the file with writeDouble.

package com.College_Java_Lab.Exp_10_File_Streams.Record;

// Source Code:

import java.io.*;
import java.util.*;

public class Lab_10b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] array =new double[8];

        System.out.println("Enter 8 grades of 8 students: ");
        for(int i=0;i<8;i++)
            array[i]=input.nextDouble();

        System.out.print("Enter data file to wrie: ");
        input.nextLine();
        String file = input.nextLine();

        try {
            DataOutputStream o=new DataOutputStream(new
                    FileOutputStream(file));
            for(int i=0;i<8;i++)
                o.writeDouble(array[i]);
            o.close();
        }
        catch(Exception ie){
            System.out.println(ie.getMessage());
        }

        System.out.println("Data is written to "+file);
        System.out.println("Reading from "+file);

        double min=10,max=0,grade;
        try {
            DataInputStream i=new DataInputStream(new FileInputStream(file));
            for(int j=0;j<8;j++) {
                grade=i.readDouble();
                if(grade<min)
                    min=grade;
                if(grade>max)
                    max=grade;
            }
            i.close();
        }
        catch(Exception ie) {
            System.out.println(ie.getMessage());
        }

        System.out.println("Lowest grade: "+min);
        System.out.println("Highest grade: "+max);
    }
}

//    Input/output:
//        Enter 8 grades of 8 students:
//        4.5
//        7.8
//        9.3
//        4.6
//        6.67
//        8.23
//        8.44
//        6.23
//        Enter data file to write : grades.bin
//        Data is written to grades.bin
//        Reading from grades.bin
//        Lowest grade : 4.5
//        Highest grade : 9.3
