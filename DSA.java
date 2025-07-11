
import java.util.*;

public class DSA {

    // reverse array
    // public static void reverse(int arr[]) {

    // int start = 0;
    // int end = arr.length - 1;

    // while (start < end) {

    // // swap arr[start] and arr[end]
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;

    // start++;
    // end--;
    // }
    // }

    // (find permutation )
    static void permute(String str, String result) {

        // Base case: if input string is empty print the result
        if (str.length() == 0) {
            System.out.println(result + " ");
            return;
        }

        // recr for each char in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // remaining string after removing chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // recr with remaining string
            permute(remaining, result + ch);
        }

    }

    // (dutch national flag problem)
    public static void sortColors(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                // swap 0 to the front
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // swap 2 to the end
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    // missing number
    public static int missingNumber(int arr[], int n) {
        int totel = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return totel - sum;

    }

    // array leader
    static void findLeader(int arr[]) {

        int n = arr.length;
        int maxFromright = arr[n - 1];

        System.out.print("Leaders: " + maxFromright + " ");

        // traverse from second last to the start

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxFromright) {
                maxFromright = arr[i];
                System.out.print(maxFromright + " ");
            }
        }
    }

 public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is sorted
            if (!swapped) break;
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if first row has zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Update first row
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Update first column
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

     public static void findSubarray(int[] arr, int target) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Shrink the window as long as sum is greater than target
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
System.out.println("No subarray found with the given sum.");
    }

       public static void main(String args[]) {

       int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        findSubarray(arr, target);
    


//  int[][] matrix = {
//             {1, 2, 3},
//             {4, 0, 6},
//             {7, 8, 9}
//         };

//         setZeroes(matrix);

//         // Print result
//         for (int[] row : matrix) {
//             for (int num : row) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }
        







// int[] arr = {64, 25, 12, 22, 11};
//         bubbleSort(arr);
//         System.out.println("Sorted array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }  

        
        
        // int arr6[] = { 16, 17, 4, 3, 5, 2 };
        // findLeader(arr6);

        // int arr[]= { 1,2,3,4,5,6,7,9,10};
        // int n=10;

        // int missing = missingNumber(arr,n);
        // System.out.println("missing number is: "+ missing);

        // int arr[] = { 2, 0, 1, 2, 2, 1, 0, };
        // sortColors(arr);
        // System.out.println(Arrays.toString(arr));

        // String input= "ABC";
        // System.out.print("permutation of input "+ input + " are: ");
        // permute(input," ");

        // find kth max and min
        // Scanner sc = new Scanner(System.in);

        // // input array size

        // System.out.print("enter the number of elements: ");
        // int n = sc.nextInt();

        // int arr1[] = new int[n];

        // // input array element
        // System.out.print("enter the element: ");
        // for (int i = 0; i < n; i++) {
        // arr1[i] = sc.nextInt();
        // }
        // // input value of k
        // System.out.print("enter the value of k: ");
        // int k = sc.nextInt();

        // // sort the array
        // Arrays.sort(arr1);

        // // check if k is valid
        // if (k > 0 && k <= n) {

        // int kthMin = arr1[k - 1];
        // int kthMax = arr1[n - k];

        // System.out.println("kth Min element: " + kthMin);
        // System.out.println("kth Max element: " + kthMax);
        // } else {

        // System.out.println(" Invalid value of k");
        // }
        // sc.close();

        // int arr[] = { 5, 4, 3, 2, 1 };
        // reverse(arr);

        // // print reverse array
        // System.out.println("reverse an array in place :");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }

}
