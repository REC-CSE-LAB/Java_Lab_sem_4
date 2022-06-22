//  Aim : - Define a class named Person that contains two instance variables of type String that stores the
//          first name and last name of a person and appropriate accessor and mutator methods. Also
//          create a method named displayDetails that outputs the details of a person. Next, define a class
//          named Student that is derived from Person , the constructor for which should receive first
//          name and last name from the class Student and also assigns values to student id, course, and
//          teacher name. This class should redefine the displayDetails method to person details as well as
//          details of a student. Include appropriate constructor(s). Define a class named Teacher that is
//          derived from Person . This class should contain instance variables for the subject name and
//          salary. Include appropriate constructor(s). Finally, redefine the displayDetails method to
//          include all teacher information in the printout. Create a main method that creates at least two
//          student objects and two teacher objects with different values and calls displayDetails for each.

package com.College_Java_Lab.Exp_6_Inheritance.For_Hackerrack_and_Record;

// Source Code :-

public class Person {

    String first_name;
    String last_name;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void displayDetails (){
        System.out.print("FirstName: " + this.getFirst_name() + ", LastName: " + this.getLast_name() + ", ");
    }

    Person(String first_name, String last_name) {
        setFirst_name(first_name);
        setLast_name(last_name);
    }

    public static void main(String[] args) {

        Student s1 = new Student("John", "Gallengher", "S001", "CS101", "Mary Kobe");
        Student s2 = new Student("Vanessa", "Jimpson", "ST01", "ALG211", "Richard Stevens");

        Teacher t1 = new Teacher("Mary", "Kobe", "Computer Science", 45000.0);
        Teacher t2 = new Teacher("Richard", "Stevens", "Mathematics and Logic", 65000.0);

        System.out.println("Printing Student(s1) details ");
        s1.displayDetails();

        System.out.println("Printing Student(s2) details ");
        s2.displayDetails();

        System.out.println("Printing Teacher(t1) details ");
        t1.displayDetails();

        System.out.println("Printing Teacher(t2) details ");
        t2.displayDetails();
    }

}

class Student extends Person {

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
        System.out.print("ID: " + this.id + ", ");
        System.out.print("Course: " + this.course + ", ");
        System.out.println("TeacherName: "+ this.teacher_name);
    }

}

class Teacher extends Person {

    String subject;
    double salary;

    Teacher(String first_name, String last_name, String subject, double salary) {
        super(first_name, last_name);
        this.subject = subject;
        this.salary = salary;
    }

    public void displayDetails (){
        super.displayDetails();
        System.out.print("Subject: " + this.subject + ", ");
        System.out.println("Salary: " + this.salary);
    }

}

//  Output :-
//      Printing Student(s1) details
//      FirstName: John, LastName: Gallengher, ID: S001, Course: CS101, TeacherName: Mary Kobe
//      Printing Student(s2) details
//      FirstName: Vanessa, LastName: Jimpson, ID: ST01, Course: ALG211, TeacherName: Richard Stevens
//      Printing Teacher(t1) details
//      FirstName: Mary, LastName: Kobe, Subject: Computer Science, Salary: 45000.0
//      Printing Teacher(t2) details
//      FirstName: Richard, LastName: Stevens, Subject: Mathematics and Logic, Salary: 65000.0
