//  Aim: b) Write a program that takes as input a set of 15 numbers from the keyboard into an array of
//          type int[] . Create another array that will also read 15 other numbers of type int into it. Now
//          merge the elements of these two arrays into one. The output is to be a two-column list. The
//          first column is a list of the distinct array elements; the second column is the count of the
//          number of occurrences of each element.

package com.College_Java_Lab.Exp_5_Methods;

import java.util.Scanner;
import java.util.Arrays;

public class Count_Repeated_in_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arr1 = new int[15];
        int [] arr2 = new int[15];

        for ( int i = 0; i < 15; ++i ){
            arr1[i] = input.nextInt();
        }
        for ( int i = 0; i < 15; ++i ){
            arr2[i] = input.nextInt();
        }

        int [][] ans = OccurrenceOfArrayElements( arr1, arr2 );
        for ( int [] an : ans ) {
            System.out.println(an[0] + " : " + an[1]);
        }
    }

    public static int[][] OccurrenceOfArrayElements ( int[] arr1, int[] arr2 ) {

        int [] arr = new int[30];
        for( int i = 0, j = 0; i < 15; ++i, ++j ){
            arr[j] = arr1[i];
            arr[++j] = arr2[i];
        }
        Arrays.sort(arr);

        int temp = arr[0],count = 0,j=0;
        int [][] ans = new int [15][2];

        for( int i : arr ){
            if( temp != i ){
                ans[j][0] = temp;
                ans[j++][1] = count;
                temp = i;
                count = 1;
            }
            else{
                ++count;
            }
        }
        ans[j][0] = temp;
        ans[j][1] = count;

        return ans;
    }

}

// Input:
//        45 12 32 12 45 78 78 78 95 64 12 14 12 33 35
//        45 98 6 5 12 78 33 35 78 95 12 32 44 99 55

// Output:
//        5 : 1
//        6 : 1
//        12 : 6
//        14 : 1
//        32 : 2
//        33 : 2
//        35 : 2
//        44 : 1
//        45 : 3
//        55 : 1
//        64 : 1
//        78 : 5
//        95 : 2
//        98 : 1
//        99 : 1