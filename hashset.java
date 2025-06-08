import java.util.*;

public class hashset {
    public static void findPairs(int arr[], int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println("(" + num + "," + complement + ")");

            }
            set.add(num);
        }

    }

    public static void main(String args[]) {

        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 3, 4, 5, 6 };

        // union
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, true);
        }

        for (int num : arr2) {
            map.put(num, true);
        }

        System.out.print("Union : ");
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // intersection
        HashMap<Integer, Boolean> map2 = new HashMap<>();
        for (int num : arr1) {
            map2.put(num, true);
        }

        System.out.print("intersection : ");
        for (int num : arr2) {
            if (map2.get(num) != null) {
                System.out.print(num + " ");
                map2.remove(num);
            }
        }

        // int arr[] = { 1, 4, 5, 6, 3, 2 };
        // int target = 7;
        // findPairs(arr, target);
    }

}
