// Exercise - 2 (b)
// Aim : Write a JAVA program to sort for an element in a given list of elements using bubble sort

// Source code :

package com.College_Java_Lab.Control_Flow;

import java.util.Scanner;

public class bubble_sort {

    public static void main(String[] args)
    {
        // Declarations
        int n,temp;
        Scanner input = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the size of the array : ");
        n = input.nextInt();

        // Reading the array elements
        int [] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for( int i = 0; i < n; ++i ){
            arr[i] = input.nextInt();
        }

        // Bubble sort logic
        for( int i = 0; i < n; ++i){
            for( int j = 0; j < n-i-1; ++j){
                if( arr[j] > arr[j+1] ){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array : ");
        for( int i = 0; i < n; ++i){
            System.out.print(arr[i]+" ");
        }
    }
}

// Input :
// 4
// 1 8 9 4

// Output :
// Enter the size of the array : 4
// Enter the array elements : 1 8 9 4
// Sorted array :
// 1 4 8 9