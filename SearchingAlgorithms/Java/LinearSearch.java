// Sudarshan Hiray
// 4th October 2020
// Given an Array of Integers and element to be searched, following program will search the element through Linear search.
// Linear search will go through all elements linearly even if element is at the end of the array. Hence its complexity is O(n).


import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of the array");
        int size = scanner.nextInt();
        System.out.println("Please enter "+size+ " elements of the array");
        int[] intArray = new int[size];
        for(int i=0;i<size;i++){
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Please enter element to be searched in the array");
        int elementToFind = scanner.nextInt();

        int position = linearSearch(intArray, elementToFind);
        if(position != -1)
            System.out.println("Element "+ elementToFind +" is FOUND at position "+ (position+1) + " in the given array");
        else
            System.out.println("Element "+ elementToFind +" is NOT FOUND in the given array");
    }

    public static int linearSearch(int[] array, int elementToFind){
        for(int i=0;i<array.length;i++){
            if(array[i] == elementToFind)
                return i;
        }
        return -1;
    }
}
