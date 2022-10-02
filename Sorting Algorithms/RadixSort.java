import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {

		System.out.println("Radix Sort : ");

		System.out.print("Enter the size of array : ");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a[] = new int[n];

			System.out.println("Enter elements : ");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println("Before sorting \n" + Arrays.toString(a)+"\n");


			// not a comparison based sorting
			radixSort(a);

			System.out.println("After sorting \n" + Arrays.toString(a));

		}
/*
		Time Complexity : O(d * (n+k)) 
		where d - number of digit in maximum element
			  n - total number of elements of given array
		if we take "k" as constant then Time Complexity : O(n)
		Space Complexity : O(n+k)
*/		
		
	}

	private static void radixSort(int[] a) {
		int max = getMax(a); // to get the maximum element

		for (int pos = 1; max / pos > 0; pos = pos * 10) // pos means 1's, 10's, 100's
			countSort(a, pos); // max/pos == to run the loop for "digit" number of times
	}

//	logic is same but way of finding value is different

	private static void countSort(int[] a, int pos) {
		int k = 10;
		int count[] = new int[k]; // here bucket is of fixed 10(0-9) digits

		// to put element at it's specified position
		for (int i = 0; i < a.length; i++) {
			int index = (a[i] / pos) % 10; // 677/10 = 67 % 10 = 7 (as pos = 10's positition)
			count[index]++;
		}

		// update the count to reflect the position
		for (int i = 1; i < k; i++)
			count[i] = count[i - 1] + count[i];

		// to put element at specified position
		int b[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
//			int x = count[(a[i]/pos)%10];
//			x--; these are not same
			b[--count[(a[i] / pos) % 10]] = a[i];
		}

		// copy element from b to a
		for (int i = 0; i < a.length; i++)
			a[i] = b[i];
	}

	private static int getMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i : a) {
			if (i > max)
				max = i;
		}
		return max;
	}
}