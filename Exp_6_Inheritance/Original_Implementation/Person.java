package com.College_Java_Lab.Exp_6_Inheritance.Original_Implementation;

public class Person {

    String first_name;
    String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String name) {
        this.first_name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String name) {
        this.last_name = name;
    }

    public void displayDetails (){
        System.out.print("FirstName: " + this.getFirst_name() + ", LastName: " + this.getLast_name() + ", ");
    }

    Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

}

//  Output :-
//      Printing Student(s1) details
//      FirstName: John, LastName: Gallengher, ID: S001 ,Course: CS101 ,TeacherName: Mary Kobe
//      Printing Student(s2) details
//      FirstName: Vanessa, LastName: Jimpson, ID: ST01 ,Course: ALG211 ,TeacherName: Richard Stevens
