//    Aim: b) Define a class called Journal that could be used to store an entry for a research paper that
//            will be published. The class should have instance variables to store the author’s name, title of
//            the paper, and the date of submission using the Date class from this chapter. Add a constructor
//            to the class that allows the user of the class to set all instance variables. Also add a method,
//            displayDetails , that outputs all the instance variables, and another method called
//            getSubmissionDetails that returns the title of the paper, with the first letter of each word
//            capitalized. Test your class from the main method.

package com.College_Java_Lab.Exp_3_Classes_and_Objects;

import java.util.Scanner;

public class Journal {

    static String author_name;
    static String title;
    static String date_of_submission;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        author_name = input.nextLine();
        title = input.nextLine();
        date_of_submission = input.nextLine();

        String [] date = date_of_submission.split("/",3);

        System.out.println( "Author is " + author_name );
        System.out.println( "Title is " + title );
        System.out.println( "Submitted on " + date[2] + "/" + date[1] + "/" + date[0] );

        for ( int i = 0; i < title.length(); ++i ){
            if( i != 0 && title.charAt(i-1) == ' ' )
                System.out.print(Character.toUpperCase(title.charAt(i)));
            else
                System.out.print(title.charAt(i));
        }

    }
}

// Input:
//    Hichem Zorgati
//    Program instrumentation and run-Time analysis of Scoped Memory in Java
//    2005/12/01

// Output:
//    Author is Hichem Zorgati
//    Title is Program instrumentation and run-Time analysis of Scoped Memory in Java
//    Submitted on 01/12/2005
//    Program Instrumentation And Run-Time Analysis Of Scoped Memory In Java