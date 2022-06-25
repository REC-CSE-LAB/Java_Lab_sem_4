// Exercise - 1 (b)
// Aim : Write a case study on public static void main(250 words).

// A simple Java Program consists of the following Syntax.

package com.College_Java_Lab.Exp_1_Basics;

public class Case_Study {
    public static void main(String [] args) {
        System.out.println("Test");
    }
}

// Input : N/A
// Output : Test

// The outcomes of not following the syntax of a Java Program :-

/*

    public :- public is an access specifier which tells that this method (or) class can be access 
    ------    anywhere in the program.
    
    Code without "public" key word :-
        public class Case_Study {
            static void main(String[] args) {
                System.out.println("Test");
            }
        }

    Error Message :-
        Error: Main method not found in class com.temp.Case_Study, please define the main method as:
                public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application
 */

/*

    static :- static is an keyword used to delcare an static class (or) method, so that was can access
    ------    them directly ( within the class ) without an instance of class.
    
    Code without "static" Key word :-
        public class Case_Study {
            public void main(String[] args) {
                System.out.println("Test");
            }
        }

     Error Message :-
        Error: Main method is not static in class com.temp.Case_Study, please define the main method as:
                 public static void main(String[] args)
 */

/*

    void :- ( in the following method ) void is the return type of the following main() method.
    ----
    
    Code without "void" key word :-
        public class Case_Study {
            public static main(String[] args) {
                System.out.println("Test");
            }
        }

    Error Message :-
        C:\Users\x\IdeaProjects\first_program\src\com\temp\Case_Study.java:4:19
                    java: invalid method declaration; return type required

 */

/*
    main :- Basically, we need an static method named "main" to execute the program.
    ----    Since, the program execution begin from the main() method.
    
    Code without "main" function name :-
        public class Case_Study {
            public static void (String[] args) {
                System.out.println("Test");
            }
        }

     Error Message :-
        C:\Users\x\IdeaProjects\first_program\src\com\temp\Case_Study.java:4:23
                    java: <identifier> expected
 */
