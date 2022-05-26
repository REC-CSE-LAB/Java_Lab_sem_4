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

    String author_name;
    String title;
    String date_of_submission;

    Journal( String name, String title, String date){
        this.author_name = name;
        this.title = title;
        this.date_of_submission = date;
    }

    public void displayDetails (){
        String [] date = this.date_of_submission.split("/",3);
        System.out.println( "Author is " + this.author_name );
        System.out.println( "Title is " + this.title );
        System.out.println( "Submitted on " + date[2] + "/" + date[1] + "/" + date[0] );
    }

    public void getSubmissionDetails(){
        for ( int i = 0; i < this.title.length(); ++i ){
            if( i != 0 && this.title.charAt(i-1) == ' ' )
                System.out.print(Character.toUpperCase(this.title.charAt(i)));
            else
                System.out.print(this.title.charAt(i));
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String author_name = input.nextLine();
        String title = input.nextLine();
        String date_of_submission = input.nextLine();

        Journal book = new Journal( author_name, title, date_of_submission );

        book.displayDetails();
        book.getSubmissionDetails();
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