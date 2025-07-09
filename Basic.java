import java .util.*;

public class Basic {
     String color;
    int speed;

    // method (member function)
    void drive() {
        System.out.println("The " + color + " car is driving at " + speed + " km/h.");
    }



    
    
    public static void main(String[] args) {

       
        // Creating an object of the Car class
        Basic myCar = new Basic();

        // Setting values
        myCar.color = "Red";
        myCar.speed = 100;

        // Calling a method on the object
        myCar.drive();

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

    
