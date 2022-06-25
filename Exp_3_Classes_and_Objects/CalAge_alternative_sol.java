package com.College_Java_Lab.Exp_3_Classes_and_Objects;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalAge_alternative_sol {

    // Years Range
    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1800;

    // Leap Year Check
    public static boolean isLeap(int year)
    {
        return (((year%4==0)&&(year%100!=0))||(year%400==0));
    }

    // Date Verification
    public static boolean isValidDate( int d, int m, int y )
    {
        if(y>MAX_VALID_YR||y<MIN_VALID_YR) return false;
        if(m<1||m>12) return false;
        if(d<1||d>31) return false;
        if(m==2)
        {
            if(isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }
        if(m == 4 || m == 6||m == 9 || m == 11) return (d <= 30);
        return true;
    }

    public static void main(String [] args) {

        // Reading Input in DD/MM/YYYY format by default
        Scanner input = new Scanner(System.in);
        String y = input.nextLine();

        // Converting the above format into YYYY-MM-DD format
        // for the usage of LocalDate package, and it's methods
        String[] s2 = y.split("/", 3);
        String Date = s2[2].concat("-");
        Date += s2[1].concat("-");
        Date += s2[0];

        // verifying date before calculating it
        if( isValidDate(  /* date : */ Integer.parseInt(s2[0]), /* month : */ Integer.parseInt(s2[1]), /* year : */ Integer.parseInt(s2[2]) ) ){

            // parsing the YYYY-MM-DD format into dob object
            LocalDate dob = LocalDate.parse(Date);

            // calculating age
            double age = calculateAge(dob);
            System.out.println( Double.parseDouble(String.format("%.1f", age)) + " years" );
        }
        else
            System.out.println("Invalid Date");
    }

    // calculating year method
    public static double calculateAge(LocalDate dob) {

        // assigning present date to "curDate"
        LocalDate curDate = LocalDate.now();

        if (dob != null){
            Period period = Period.between(dob, curDate);
            return period.getYears() + period.getMonths()*0.08 - period.getDays()*0.0027;
        }
        else
            return 0;
    }
}

//    Sample Input 0 :-
//    --------------
//        01/01/2001
//
//    Sample Output 0 :-
//    ---------------
//        21.3 years

//    Sample Input 1 :-
//    --------------
//        17/09/1998
//
//    Sample Output 1 :-
//    ---------------
//        23.7 years

//    Sample Input 2 :-
//    --------------
//        30/02/1947
//
//    Sample Output 2 :-
//    ---------------
//        Invalid Date