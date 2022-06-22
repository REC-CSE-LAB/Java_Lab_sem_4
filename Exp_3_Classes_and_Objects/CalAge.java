// Aim: a) Define a class called CalAge . This class is used to calculate age of a person from her or his
//         date of birth and the current date. Include a mutator method that allows the user to enter her or
//         his date of birth and set the value for current date. Also include a method to return the age in
//         years and months (for example, 25.5 years) as a double value. Include an additional method to
//         check if the date of birth entered by the user is a valid one. For example, 30 February 2008 is
//         an invalid date. Embed your class in a test program.

package com.College_Java_Lab.Exp_3_Classes_and_Objects;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class CalAge {
    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1800;
    public static boolean isLeap(int year)
    {
        return (((year%4==0)&&(year%100!=0))||(year%400==0));
    }
    public static boolean isValidDate(int d,int m,int y)
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
    public static void findAge(int current_date, int current_month,int current_year, int birth_date,int birth_month, int birth_year)
    {
        double d;
        int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if( birth_month == 2 && isLeap(birth_year) ){
            month [1] = 29;
        }
        
        if(birth_date > current_date) {
            current_month = current_month - 1;
            current_date = current_date + month[birth_month -1];
        }

        if(birth_month > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }
        String calculated_month = Integer.toString(current_month - birth_month -1);
        String calculated_year = Integer.toString(current_year - birth_year);
        String date= calculated_year+calculated_month+'0';
        d=(Double.parseDouble(date))/100.0;
        System.out.printf("%.1f years",d);

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String[] s1 = (dtf.format(now)).split("/", 5);
        int current_date=Integer.parseInt(s1[0]);
        int current_month=Integer.parseInt(s1[1]);
        int current_year=Integer.parseInt(s1[2]);
        String y=s.nextLine();
        String[] s2 = y.split("/", 3);
        int birth_date=Integer.parseInt(s2[0]);
        int birth_month=Integer.parseInt(s2[1]);
        int birth_year=Integer.parseInt(s2[2]);
        if(isValidDate(birth_date,birth_month,birth_year))
            findAge(current_date, current_month, current_year,birth_date, birth_month, birth_year);
        else
            System.out.println("Invalid Date");
    }
}

// Input:
// 01/01/2001

// Output:
// 21.3 years
