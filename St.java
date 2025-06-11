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

      
    
    public static void main(String args[]){

String s1 = "Listen";
        String s2 = "Silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");







        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the element:  ");
        // String input = sc.nextLine();

        // String Original = input.toLowerCase();
        // String reversed = "";

        // for(int i= Original.length()-1; i>=0;i--){
        //     reversed += Original.charAt(i);

        // }
        // if(Original.equals(reversed)){
        //     System.out.println("Palindrome....");
        // }
        // else{
        //     System.out.println("not a Palindrome...");
        // }
    }
}
}