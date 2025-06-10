import java.util.*;

public class St {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element:  ");
        String input = sc.nextLine();

        String Original = input.toLowerCase();
        String reversed = "";

        for(int i= Original.length()-1; i>=0;i--){
            reversed += Original.charAt(i);

        }
        if(Original.equals(reversed)){
            System.out.println("Palindrome....");
        }
        else{
            System.out.println("not a Palindrome...");
        }
    }
}
