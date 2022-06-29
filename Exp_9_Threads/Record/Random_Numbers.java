// Aim: c) Write a Java program which first generates a set of random numbers and then determines
//         negative, positive even, positive odd numbers concurrently.

package com.College_Java_Lab.Exp_9_Threads.Record;

import java.util.Random;
import java.util.Scanner;

public class Random_Numbers extends Thread {

    int n, min, max;

    public Random_Numbers(int n, int min, int max) {
        this.n = n;
        this.min = min;
        this.max = max;
    }

    public  void run() {

        Random rand = new Random();

        while ( n > 0) {

            int num = rand.nextInt(max) - (min+max)/2;

            if( num == 0 )
                continue;

            System.out.println( num + " - "+ num_type(num) );
            --n;
        }
    }

    public String num_type(int num) {
        if( num > 0 && num%2 == 0){
            return "Positive Even";
        }
        else if(num > 0){
            return "Positive Odd";
        }
        return "Negative";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements to be generated : ");
        int n = in.nextInt();
        System.out.print("Enter minimum : ");
        int min = in.nextInt();
        System.out.print("Enter maximum: ");
        int max = in.nextInt();
        Random_Numbers num = new Random_Numbers( n, min, max);
        num.start();
    }
}

// INPUT/OUTPUT:
//
//        Enter number of elements to be generated : 5
//        Enter minimum : -6
//        Enter maximum: 8
//        4 - Positive Even
//        3 - Positive Odd
//        -3 - Negative
//        6 - Positive Even
//        -1 - Negative