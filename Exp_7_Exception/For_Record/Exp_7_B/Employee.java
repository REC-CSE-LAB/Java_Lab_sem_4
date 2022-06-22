//  Aim:-  (b)  Extend the previous problem to calculate the salary deductions based on the number of
//              days an employee is on leave. Consider 20 working days per month. Add a method that
//              calculates the deductions of each employee based on their leave record. In your main method,
//              create an array of type deduction filled with sample data of all types of Employees. Finally,
//              calculate the total deduction that iterates through the array and returns the total
//              amount of deductions of all the employees in a month

package com.College_Java_Lab.Exp_7_Exception.For_Record.Exp_7_B;

import java.util.Scanner;

public class Employee {

    double salary;
    int no_of_leaves;
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

    public int getNo_of_leaves() {
        return no_of_leaves;
    }

    public void setNo_of_leaves(int no_of_leaves) {
        this.no_of_leaves = no_of_leaves;
    }

    public void addBonus (){
        this.salary += 200;
    }

    public void removeBonus (){
        this.salary -= 200;
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

    public double Deduction() {
        this.removeBonus ();
        double salPart = getSalary()/20;
        double deductionAmount = salPart * getNo_of_leaves();
        double finalSalary = getSalary() - deductionAmount;
        return deductionAmount;
    }




    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String employee_id ;
        String employee_name ;
        String department ;
        String designation ;
        String salary ;

        Employee[] e = new Employee[2];

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

        String leaves = input.nextLine();
        e[0].setNo_of_leaves( Integer.parseInt( leaves ) );
        System.out.println("Employee 1 LOP:" + e[0].Deduction() );

        leaves = input.nextLine();
        e[1].setNo_of_leaves( Integer.parseInt( leaves ) );
        System.out.println("Employee 2 LOP:" + e[1].Deduction() );

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
    public void removeBonus (){
        this.salary -= 300;
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
    public void removeBonus (){
        this.salary -= 100;
    }

    @Override
    public boolean equals (Employee e) {
        System.out.print("Designations are identical:");
        return super.equals(e);
    }

}
