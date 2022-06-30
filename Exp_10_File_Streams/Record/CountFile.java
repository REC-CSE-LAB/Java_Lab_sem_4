//  Aim: a) Write a program that will count the total occurrences of
//          the number ‘10’ in a text file of strings representing
//          numbers of type int and will show the value of the count
//          on the screen once the whole file is read. The file contains
//          the following numbers separated by space.
//                10 4 7 8 10 34 11 10 15 6 10

package com.College_Java_Lab.Exp_10_File_Streams.Record;

// Source Code:

import java.io.*;
import java.util.*;

public class CountFile{
    private final String filename;

    public CountFile(String filename) {
        this.filename = filename;
    }

    int countTens(){
        int count=0;
        try{
            FileReader fr = new FileReader(filename);
            String fd="";
            int ch;
            while((ch=fr.read())!=-1){
                if((char)ch==' '|| (char)ch=='\n'){
                    if(fd.equals("10"))
                        count+=1;
                    fd="";
                }
                else{
                    fd += (char)ch;
                }
            }
            if(fd.equals("10"))
                count+=1;
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
class Lab_10 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("sample.txt")){
            fw.write ("10 4 7 8 10 34 11 10 15 6 10");
            //In this experiment 10-a writing to a file is not given but
            // you should ensure this file is already created before reading from it.
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
        String filename;
        System.out.print("Enter filename to read: ");
        //now enter filename as sample.txt ( you can find this file in C drive)
        Scanner s = new Scanner(System.in);
        filename = s.nextLine();
        CountFile c = new CountFile(filename);
        System.out.println("\nTotal number of 10's: "+c.countTens());
    }
}
//  Input/Output:
//        Enter filename to read : sample.txt
//        Total number of 10’s : 04
