package java_week_9_programmes;

import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class ReverseArray_3 {
    public static void main(String[] args) {
        int n, i, j = 0;
        Scanner s = new Scanner(System.in);   //Scanner declaration
        System.out.println("Enter number of elements in the array: ");
        n = s.nextInt();
        int array [] = new int[n];
        int rev [] = new int[n];
        System.out.println("Enter "+ n + " elements ");
        for (i = 0; i < n; i++){                //for loop use for creating an array
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of an array is : ");
        for (i =n; i>0; i--, j++){          //for loop used for reversing the array
            rev [j] = array[i-1];
            System.out.println(rev[j]);
        }
        s.close();          //Scanner closing
}
}