
import java.util.*;

public class DSA {

    public static void reverse(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input array size

        System.out.print("enter the number of elements: ");
        int n= sc.nextInt();
        
        int arr1[]= new int[n];

        //input array element

        System.out.print("enter the element: ");
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();

        }
        //input value of k
        System.out.print("enter the value of k: ");
        int k = sc.nextInt();

        //sort the array
        Arrays.sort(arr1);

        //check if k is valid

     if(k>0&& k<=n){

        int kthMin = arr1[k-1];
        int kthMax = arr1[n-k];

        System.out.println("kth Min element: "+ kthMin);
        System.out.println("kth Max element: "+kthMax);
     }
     else{

        System.out.println(" Invalid value of k");
     }
     sc.close();










        // int arr[] = { 5, 4, 3, 2, 1 };
        // reverse(arr);

        // // print reverse array
        // System.out.println("reverse an array in place :");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        //}

    }

}
