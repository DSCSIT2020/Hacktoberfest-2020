// Sudarshan Hiray
// 4th October 2020
// Given an Array of Integers and element to be searched, following program will search the element through Binary search.
// Elements MUST be sorted for binary search.
// Binary search uses Divide And Conquer technique.
// In each step, the algorithm compares the input element x with the value of the middle element in array. 
// If the values match, return the index of the middle. Otherwise, if x is less than the middle element, 
// then the algorithm recurs for left side of middle element, else recurs for the right side of the middle element.

import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of the array");
        int size = scanner.nextInt();
        System.out.println("Please enter "+size+ " elements of the array");
        System.out.println("Enter elements in Ascending order as Binary search can work only with Sorted elements");
        int[] intArray = new int[size];
        for(int i=0;i<size;i++){
            intArray[i] = scanner.nextInt();
            if(i>0 && intArray[i]<intArray[i-1]){
                System.out.println("Element entered was not in ascending order.. Exiting, please re-run and enter elements in Ascending order");
                System.exit(0);
            }
        }

        System.out.println("Please enter element to be searched in the array");
        int elementToFind = scanner.nextInt();

        int position = binarySearch(intArray, 0, size, elementToFind);
        if(position != -1)
            System.out.println("Element "+ elementToFind +" is FOUND at position "+ (position+1) + " in the given array");
        else
            System.out.println("Element "+ elementToFind +" is NOT FOUND in the given array");
    }

    public static int binarySearch(int A[], int left, int right,  int k){
        if(left > right)
            return -1;
        int mid = (left + right)/2;
        if(A[mid] == k)
            return mid;
        else if(A[mid] < k)
            return binarySearch(A, mid+1, right, k);
        else if(A[mid] > k)
            return binarySearch(A, left, mid-1, k);
        else
            return -1;
    }
}
