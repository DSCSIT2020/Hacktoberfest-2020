import java.util.Scanner;
import java.util.Arrays;

//Using stream method of Array class

public class min_max_sum_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("The maximum value in the array is: " + max);

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("The minimum value in the array is: " + min);

        int sum = Arrays.stream(arr).sum();
        System.out.println("The sum of elements in the array is: " + sum);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("The average value in the array is: " + avg);

    }
}
