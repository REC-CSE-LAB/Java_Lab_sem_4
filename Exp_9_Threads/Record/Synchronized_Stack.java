//  Aim: b) Write a Java program which handles Push operation and Pop operation on stack
//          concurrently.

package com.College_Java_Lab.Exp_9_Threads.Record;

import java.util.Scanner;
import java.util.Random;

public class Synchronized_Stack extends Thread {

    private int top,count;
    private final int [] stack;

    public Synchronized_Stack( int size ){
        this.stack = new int [size];
        this.count = size;
        this.top = -1;
    }

    public synchronized Integer pop(){
        if( top == -1 ){
            System.out.println("Stack is empty, can not pop items");
            return -1;
        }
        return stack[top--];
    }

    public synchronized void push(int item){
        if( top == stack.length ){
            System.out.println("Stack is full, can not push items");
            return ;
        }
        stack[++top] = item;
    }

    public void run() {

        Random rand = new Random();

        while (count > 0) {

            int item = rand.nextInt(50);

            System.out.println("Pushed " + item);
            this.push(item);

            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            item = this.pop();
            System.out.println("Popped " + item);

            --count;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the stack : ");
        int size = in.nextInt();
        System.out.println( size + " random elements are pushed and popped below:");
        Synchronized_Stack s = new Synchronized_Stack(size);
        s.start();
    }
}

// INPUT/OUTPUT :
//        Enter the size of the stack : 3
//        3 random elements are pushed and popped below:
//        Pushed 32
//        Popped 32
//        Pushed 31
//        Popped 31
//        Pushed 11
//        Popped 11
