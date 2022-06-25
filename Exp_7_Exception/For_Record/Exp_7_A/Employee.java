// Aim: (a) Create a class named Employee that can be used to calculate the salaries of different
//          employees. The Employee class should keep a track of the employee ID, name, department,
//          salary, and designation with appropriate accessor and mutator methods. Also create an
//          equals() method that overrides Object’s equals() method, where employees can check if their
//          designation is identical. Next, create two additional classes named Manager and Clerk that are
//          derived from Employee . Create an overridden method name addBonus that returns the salary of the
//          employee after adding up the bonus. There is a default bonus of $200/month. Managers have a bonus
//          of $300/month and clerks have a bonus of $100/month. Finally, create a display method to print
//          the details of the employee. You may assume the initial salary of an employee and other necessary
//          values. Test your classes from a main method.

package com.College_Java_Lab.Exp_7_Exception.For_Record.Exp_7_A;

// Source Code :-

import java.util.Scanner;

public class Employee {

    double salary;
    String employee_id;
    String employee_name;
    String department;
    String designation;

    Employee( String id, String name, String department, String designation, double salary ) {
        this.setEmployee_id( id );
        this.setEmployee_name( name );
        this.setDepartment( department );
        this.setDesignation(designation );
        this.setSalary( salary );
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        this.addBonus();
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void addBonus (){
        this.salary += 200;
    }

    public void displayDetails () {
        System.out.print("Employee Id:" + this.getEmployee_id() + " ");
        System.out.print("Name:" + this.getEmployee_name() + " ");
        System.out.print("Department: " + this.getDepartment() + " ");
        System.out.print("Designation:" + this.getDesignation() + " ");
        System.out.println("Salary:" + this.getSalary());
    }

    public boolean equals(Employee e) {
        return(e.designation.equals(this.designation));
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String employee_id ;
        String employee_name ;
        String department ;
        String designation ;
        String salary ;


        Employee [] e = new Employee[2];

        for( int i = 0; i < 2; ++i ){

            employee_id = input.nextLine();
            employee_name = input.nextLine();
            department = input.nextLine();
            designation = input.nextLine();
            salary = input.nextLine();

            if( designation.equals("Manager") )
                e[i] = new Manager( employee_id, employee_name, department, designation, Double.parseDouble(salary) );
            else
                e[i] =  new Clerk( employee_id, employee_name, department, designation, Double.parseDouble(salary) );

            e[i].displayDetails();
        }

        System.out.println( e[0].equals(e[1]) );
    }

}

class Manager extends Employee {

    Manager(String id, String name, String department, String designation, double salary) {
        super(id, name, department, designation, salary);
    }

    @Override
    public void addBonus () {
        salary += 300;
    }

    @Override
    public boolean equals (Employee e) {
        System.out.print("Identical designations:");
        return super.equals(e);
    }

}

class Clerk extends Employee {

    Clerk(String id, String name, String department, String designation, double salary) {
        super(id, name, department, designation, salary);
    }

    @Override
    public void addBonus () {
        salary += 100;
    }

    @Override
    public boolean equals (Employee e) {
        System.out.print("Designations are identical:");
        return super.equals(e);
    }

}

//  Input 0:-
//  -------
//      M001
//      Varun
//      Sales
//      Manager
//      35000
//      C001
//      Kumar
//      Sales
//      Clerk
//      17000
//
//  Output 0:-
//  --------
//      Employee Id:M001 Name:Varun Department: Sales Designation:Manager Salary:35300.0
//      Employee Id:C001 Name:Kumar Department: Sales Designation:Clerk Salary:17100.0
//      Identical designations:false


//  Input 1:-
//  -------
//      C002
//      Varun
//      Sales
//      Clerk
//      18000
//      C001
//      Kumar
//      Sales
//      Clerk
//      17000
//
//  Output 1:-
//  --------
//      Employee Id:C002 Name:Varun Department: Sales Designation:Clerk Salary:18100.0
//      Employee Id:C001 Name:Kumar Department: Sales Designation:Clerk Salary:17100.0
//      Designations are identical:true
