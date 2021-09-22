package com.learning.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to sort: ");
        n=sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            //reading array elements from the user
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int arr1[] = QuickSort(arr,0,9);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr1));
    }

    static int[] QuickSort (int arr[], int begin, int end)
    {
        if (begin < end)
        {
            int PIndex = Partition (arr, begin, end);

            QuickSort(arr, begin,PIndex-1);
            QuickSort(arr, PIndex+1, end);

        }
        return arr;
    }

    static int Partition(int arr[], int begin, int end)
    {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j= begin; j<end; j++)
        {
            if (arr[j] < pivot)
            {
                i++;

                int SwapTemp = arr[i];
                arr[i] = arr[j];
                arr[j]=SwapTemp;

            }
        }

        int SwapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end]=SwapTemp;

        return i+1;
    }


}
