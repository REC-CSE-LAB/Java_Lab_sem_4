//  Aim: b) Modify the previous exercise to include methods for amount deposited and amount
//          withdrawn. Create your own exception class which will check inside the method for the
//          amount deposited so that after the deposit, the maximum balance in the account must not be
//          more than $5000. Also, check inside the method for amount withdrawn so that the available
//          balance after the withdrawal does not go below $1000. Invoke the defined methods from your
//          main method and catch the exceptions.

package com.College_Java_Lab.Exp_8_Exception_Handling.Record;

// Source code:-
import java.util.Scanner;

class AD {
    private String customerID;
    private int accountNumber;
    private double initBalance;

    void setInitBalance(double initBalance){
        this.initBalance=initBalance;
    }
    double getInitBalance(){
        return initBalance;
    }
    void readAccountDetails()
    {
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
            try{
                System.out.print("Enter InitialBalance: ");
                initBalance=s.nextDouble();
                setInitBalance(initBalance);
                if (initBalance <= 1000)
                    throw new Exception("Initial balance must be above $1000\n");
                break;
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    void deposit() {

        Scanner s = new Scanner(System.in);
        double amount;

        while(true) {
            try {
                System.out.print("ENTER AMOUNT TO DEPOSIT : ");
                amount = s.nextDouble();
                if (getInitBalance() + amount > 5000)
                    throw new InvalidAmount('D', amount);
                else {
                    setInitBalance(initBalance += amount);
                    System.out.println("Yes,your amount is deposited ,current balance : " + getInitBalance());
                    break;
                }
            }
            catch (InvalidAmount i) {
                System.out.println(i.getMessage());
            }
        }
    }
    void withdraw() {

        Scanner s = new Scanner(System.in);
        double withdrawAmount;

        while(true) {
            try {
                System.out.print("ENTER AMOUNT TO WITHDRAW : ");
                withdrawAmount= s.nextDouble();
                if (getInitBalance() - withdrawAmount < 1000)
                    throw new InvalidAmount('W', withdrawAmount);
                else {
                    setInitBalance(initBalance -= withdrawAmount);
                    System.out.println("Yes,your amount is " + withdrawAmount + " ,current balance : " + getInitBalance() + "\n");
                }
                break;
            }
            catch (InvalidAmount i) {
                System.out.println(i.getMessage());
            }
        }
    }
    void displayAccountDetails() {
        System.out.println("\n ACCOUNT_DETAILS ");
        System.out.println("CUSTOMER ID :"+customerID+"\nACCOUNT_NUMBER:"+accountNumber+"\nINITIAL BALANCE :"+initBalance+"\n");
    }
}
class InvalidAmount extends Exception {

    char transactionType;
    double amount;

    InvalidAmount(char t_type,double amount) {
        this.transactionType=t_type;
        this.amount=amount;
    }
    public String toString() {
        if(transactionType=='D')
            return "Sorry,account balance is more than 5000,you cannot deposit "+amount;
        if(transactionType=='W')
            return "Sorry,account balance is less than "+amount+" you cannot withdraw "+amount;
        return "1";
    }
}
public class Lab_8b {
    public static void main(String[] args) {
        AD ad= new AD();
        ad.readAccountDetails();
        ad.displayAccountDetails();
        ad.deposit();
        ad.withdraw();
    }
}

//  INPUT/OUTPUT :
//
//        Enter CustomerId: a123
//        Enter accountNumber: 12345
//        Enter InitialBalance: 2000
//
//        ACCOUNT_DETAILS
//        CUSTOMER ID :a123
//        ACCOUNT_NUMBER:12345
//        INITIAL BALANCE :2000.0
//
//        ENTER AMOUNT TO DEPOSIT : 4000
//        null
//        ENTER AMOUNT TO DEPOSIT : 1500
//        Yes,your amount is deposited ,current balance : 3500.0
//
//        ENTER AMOUNT TO WITHDRAW : 10000
//        null
//        ENTER AMOUNT TO WITHDRAW : 1000
//        Yes,your amount is 1000.0 ,current balance : 2500.0