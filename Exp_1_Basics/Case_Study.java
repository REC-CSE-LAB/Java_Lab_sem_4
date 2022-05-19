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

/*
    Code with "String [] args" arguments :-
        public class Case_Study {
            public static void main() {
                System.out.println("Test");
            }
        }

     Error Message :-
        Error: Main method not found in class com.temp.Case_Study, please define the main method as:
                public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application
 */