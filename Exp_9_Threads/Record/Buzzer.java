//  Aim: a) Write a program to simulate a buzzer. The program should make use of the Thread class.
//          Create a class named Buzzer that extends the Thread class. Create an interface named
//          MonitorTime which contains a method setBuzzerTime() . Your Buzzer class should
//          implement this interface. Override setBuzzerTime() method to set the buzzer time delay in
//          milliseconds and the number of times the buzzer should be repeated. Also, include
//          methodsblowBuzzer to start the buzzer.

package com.College_Java_Lab.Exp_9_Threads.Record;

// Source code:
import java.util.Scanner;

interface MonitorTime{
    void setBuzzerTime(int time);
}

public class Buzzer extends Thread implements MonitorTime {

    @Override
    public void setBuzzerTime(int time) {
        try {
            Thread.sleep(time* 1000L);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    Buzzer( int no ) {
        System.out.println( no + " Buzzer started...");
        this.start();
    }

    static void methodsblowBuzzer (int n, int time ){
        for( int i = 1; i <= n; ++i ) {
            Buzzer buzz = new Buzzer( i );
            buzz.setBuzzerTime(time);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of times buzzer should be repeated : ");
        int n = in.nextInt();
        System.out.print("Set Buzzer time delay in seconds : ");
        int time = in.nextInt();
        methodsblowBuzzer( n, time);
    }

}

// INPUT/OUTPUT:
//        Enter number of times buzzer should be repeated : 3
//        Set Buzzer time delay in seconds : 1
//        1 Buzzer started...
//        2 Buzzer started...
//        3 Buzzer started...