package com.College_Java_Lab.Exp_6_Inheritance.Original_Implementation;

public class Student extends Person {

    String id;
    String course;
    String teacher_name;

    Student(String first_name, String last_name, String id, String course, String teacher_name) {
        super(first_name, last_name);
        this.id = id;
        this.course = course;
        this.teacher_name = teacher_name;
    }

    public void displayDetails (){
        super.displayDetails();
        System.out.print("ID: " + this.id + " ,");
        System.out.print("Course: " + this.course + " ,");
        System.out.println("TeacherName: "+ this.teacher_name);
    }

    public static void main(String[] args){
        Student s1 = new Student("John", "Gallengher", "S001", "CS101", "Mary Kobe");
        Student s2 = new Student("Vanessa", "Jimpson", "ST01", "ALG211", "Richard Stevens");

        System.out.println("Printing Student(s1) details ");
        s1.displayDetails();

        System.out.println("Printing Student(s2) details ");
        s2.displayDetails();
    }
}

//  Output :-
//      Printing Student(s1) details
//      FirstName: John, LastName: Gallengher, ID: S001 ,Course: CS101 ,TeacherName: Mary Kobe
//      Printing Student(s2) details
//      FirstName: Vanessa, LastName: Jimpson, ID: ST01 ,Course: ALG211 ,TeacherName: Richard Stevens
