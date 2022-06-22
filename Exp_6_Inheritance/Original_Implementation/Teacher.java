package com.College_Java_Lab.Exp_6_Inheritance.Original_Implementation;

public class Teacher extends Person {

    String subject;
    double salary;

    Teacher(String first_name, String last_name, String subject, double salary) {
        super(first_name, last_name);
        this.subject = subject;
        this.salary = salary;
    }

    public void displayDetails (){
        super.displayDetails();
        System.out.print("Subject: " + this.subject + " ,");
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mary", "Kobe", "Computer Science", 45000.0);
        Teacher t2 = new Teacher("Richard", "Stevens", "Mathematics and Logic", 65000.0);

        System.out.println("Printing Teacher(t1) details");
        t1.displayDetails();

        System.out.println("Printing Teacher(t2) details");
        t2.displayDetails();
    }
}

// Output :-
//      Printing Teacher(t1) details
//      FirstName: Mary, LastName: Kobe, Subject: Computer Science ,Salary: 45000.0
//      Printing Teacher(t2) details
//      FirstName: Richard, LastName: Stevens, Subject: Mathematics and Logic ,Salary: 65000.0