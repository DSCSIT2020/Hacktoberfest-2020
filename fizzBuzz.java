//FizzBuzz code for Java! Recomend copying into a java file on it's own to test,
// or go to https://www.jdoodle.com/online-java-compiler/ and test it out!



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------");
        System.out.println("Enter a number to get back, Fizz, Buzz or Fizzbuzz!!!");
        System.out.println("-----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        fizzBuzz(number);
        System.out.println("Run again to try another number!");
    }

    private static void fizzBuzz(int number) {

        if(number % 3 == 0) {
            if(number % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else { System.out.println("Fizz");}}
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else { System.out.println("This number doesn't make the fizz buzz!");}
    }
}