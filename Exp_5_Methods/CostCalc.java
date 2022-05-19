// Aim: a) You are running a courier agency. The weight of a parcel determines the number of stamps
//         that will be needed to send that parcel. For each kilogram, a stamp of $2 is needed. Create a
//         class to accept the weight of five parcels in floating-point values. Also, the courier company
//         charges an additional rate depending on where the courier has to be delivered. The charges are
//         $20 for delivery within the city of posting, and $40 for delivery anywhere else in the country.
//         Write a computer program to calculate and display the total cost of each parcel depending on
//         the weight and delivery location of the parcel.

package com.College_Java_Lab.Exp_5_Methods;

import java.util.Scanner;
import java.lang.Math;

public class CostCalc{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String delivery_area = input.next();

        float [] parcels = new float[5];
        for( int i = 0; i < 5; ++i ){
            parcels[i] = input.nextFloat();
        }

        total_cost( parcels, delivery_area );
    }
    public static void total_cost ( float [] arr, String str ){
        float total = 0;
        for( float i : arr ){
            total += i;
        }
        if( str.equals("Inside") ){
            System.out.println(total*2+20);
        }
        else{
            System.out.println(total*2+40);
        }
    }
}

// Input :
//    Inside
//    12
//    2.5
//    3.4
//    7.2
//    10.0

// Output :
//    90.2