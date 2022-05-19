// Exercise - 2 (a)
// Aim : Write a JAVA program to search for an element in a given list of elements using binary
//       search mechanism.

// Source Code :

package com.College_Java_Lab.Exp_2_Control_Flow;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args){

        // Declaration
        Scanner input = new Scanner(System.in);
        int n,i,key,low,high,mid;

        // Reading the array size
        System.out.print("Enter the size of the array : ");
        n = input.nextInt();

        // Reading the array elements
        int [] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for( i = 0; i < n; ++i ){
            arr[i]=input.nextInt();
        }

        // Reading the search elements
        System.out.print("Enter the search element : ");
        key = input.nextInt();
        low = 0;
        high = n-1;

        // Binary Search Logic
        while( low <= high){
            mid=(low+high)/2;
            if ( arr[mid] == key ) {
                System.out.println("Element found at position "+(mid+1));
                break;
            }
            else if( arr[mid] > key ){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low>high){
            System.out.println("Element not found!!");
        }
    }
}

// Input :
//  5
//  1 9 18 27 36
//  27

// Output :
// Enter the size of the array : 5
// Enter the array elements : 1 9 18 27 36
// Enter the search element : 27
// Element found at position 4

