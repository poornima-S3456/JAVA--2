import java .util.*;

public class Basic {
        
    public static void main(String[] args) {

        //code 1
        int[] numbers = {45, 32, 89, 12, 67, 90, 23};

        int max = numbers[0]; // Assume first element is the max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current is greater
            }
        }

        System.out.println("Maximum element in the array: " + max);


        //code2
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
    }
}

    
