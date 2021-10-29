package com.learning.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String args[])
    {
        int n1=0;
        int i = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sort: ");
        n1=sc.nextInt();
        System.out.println (n1);
        int[] arr = new int[n1];
        System.out.println("Enter the elements of the array: ");

        for(i=0; i<n1; i++)
        {
            //reading array elements from the user
            arr[i]=sc.nextInt();
        }

        int arr1[] = MSort(arr,0,n1-1);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr1));
    }

    static int[] MSort (int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            MSort(arr, l, m);
            MSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;
    }

    // Merges two sub arrays of arr[].
    // First sub array is arr[l to m]
    // Second sub array is arr[m+1 to r]
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two sub arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
