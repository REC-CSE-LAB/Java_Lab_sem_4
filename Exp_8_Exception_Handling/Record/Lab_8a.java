//  Aim: a) Define a class to maintain bank accounts of customers. The program should place the code
//          into a try-catch block with multiple catches to check for the validity of various attributes
//          based on the following criteria.
//              1. Customer ID must start with a letter and should be followed by three digits.
//              2. Account number must be of five digits.
//              3. Initial balance must be above $1000.
//        Print suitable error matches within the catch block. If any of the criteria mentioned above is
//        not fulfilled, the program should loop back and let the user enter new data.

package com.College_Java_Lab.Exp_8_Exception_Handling.Record;

// Source code:-
import java.util.Scanner;

class AccountDetails {

    private String customerID;
    private int accountNumber;
    private double initBalance;

    void read_Account_Details() {

        Scanner s = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Enter CustomerId: ");
                customerID = s.next();
                if (!(Character.isLetter(customerID.charAt(0)) &&
                        Character.isDigit(customerID.charAt(1)) &&
                        Character.isDigit(customerID.charAt(2)) &&
                        Character.isDigit(customerID.charAt(3))))
                    throw new Exception("Customer ID must start with a letter and should be followed by three digits\n");
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            try {
                System.out.print("Enter accountNumber: ");
                accountNumber = s.nextInt();
                if (String.valueOf(accountNumber).length() != 5)
                    throw new Exception("Account no must be of five digits\n");
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            try {
                System.out.print("Enter InitialBalance: ");
                initBalance=s.nextDouble();
                if (initBalance <= 1000)
                    throw new Exception("Initial balance must be above $1000\n");
                break;
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    void display_Account_Details() {
        System.out.println("\n*** ACCOUNT_DETAILS ***");
        System.out.println("CUSTOMER ID : "+customerID+"\nACCOUNT_NUMBER : "+accountNumber+"\nINITIAL BALANCE : "+initBalance);
    }
}
public class Lab_8a {
    public static void main(String[] args) {
        AccountDetails ad= new AccountDetails();
        ad.read_Account_Details();
        ad.display_Account_Details();
    }

}

//    INPUT/OUTPUT :-
//
//        Enter CustomerId: CUS
//        java.lang.Exception: Customer ID must start with a letter and should be followed by three digits
//
//        Enter CustomerId: a123
//        Enter accountNumber: 2
//        java.lang.Exception: Account no must be of five digits
//
//        Enter CustomerId: a123
//        Enter accountNumber: 12345
//        Enter InitialBalance: 1000
//        java.lang.Exception: Initial balance must be above $1000
//
//        Enter CustomerId : a123
//        Enter accountNumber : 12345
//        Enter InitialBalance : 2000
//
//        *** ACCOUNT_DETAILS ***
//        CUSTOMER ID : a123
//        ACCOUNT_NUMBER : 12345
//        INITIAL BALANCE : 2000.0