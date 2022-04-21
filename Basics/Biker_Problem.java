// Exercise - 1 (c)
//  Aim :  Five Bikers Compete in a race such that they drive at a constant speed which may or may
//        not be the same as the other. To qualify the race, the speed of a racer must be more than the
//        average speed of all 5 racers. Take as input the speed of each racer and print back the speed of
//        qualifying racers.

// Source Code :
package com.College_Java_Lab.Basics;

import java.util.Scanner;

public class Biker_Problem {
    public static void main(String[] args) {
        int total_speed = 0;
        int [] bikers = new int [5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Speed of 5 bikers : ");
        for( int i = 0; i < 5; ++i ){
            bikers[i] = input.nextInt();
            total_speed += bikers[i];
        }
        int avg = total_speed/5;
        System.out.print("The qualified racers of the race are : ");
        for( int  i = 0; i < 5; ++i ){
            if( bikers[i] > avg ){
                System.out.print( bikers[i] + " ");
            }
        }
    }
}

// Input :
// 14 55 86 42 25

// Output :
// Enter the Speed of 5 bikers : 14 55 86 42 25
// The qualified racers of the race are : 55 86