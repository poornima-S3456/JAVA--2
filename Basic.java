public class Basic {
    public static void main(String[] args) {
        int[] numbers = {45, 32, 89, 12, 67, 90, 23};

        int max = numbers[0]; // Assume first element is the max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current is greater
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }
}

    
