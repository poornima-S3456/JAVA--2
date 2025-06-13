import java.util.*;

public class St {
    static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    // count and say problem
    public static String countAndSay(int n) {
        if (n <= 0)
            return "";

        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            char prev = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == prev) {
                    count++;
                } else {
                    current.append(count).append(prev);
                    count = 1;
                    prev = result.charAt(j);
                }
            }

            current.append(count).append(prev);
            result = current.toString();
        }

        return result;
    }

    //longest common prefix
     public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

         public static void main(String args[]) {
String[] words = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    



        // Driver code to test the function{
        // int n = 5;
        // System.out.println("Count and Say of " + n + " is: " + countAndSay(n));

        // String s1 = "Listen";
        // String s2 = "Silent";

        // if (areAnagrams(s1, s2)) {
        // System.out.println("The strings are anagrams.");
        // } else {
        // System.out.println("The strings are NOT anagrams.");

        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the element: ");
        // String input = sc.nextLine();

        // String Original = input.toLowerCase();
        // String reversed = "";

        // for(int i= Original.length()-1; i>=0;i--){
        // reversed += Original.charAt(i);

        // }
        // if(Original.equals(reversed)){
        // System.out.println("Palindrome....");
        // }
        // else{
        // System.out.println("not a Palindrome...");
        // }
    }
}
