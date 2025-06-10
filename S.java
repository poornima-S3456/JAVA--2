import java.util.*;

public class S  {

    //check palindrome
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




       //( reversed string)
        // String str = "hellow";
        // String reversed = new StringBuilder(str).reverse().toString();
        // System.out.println("reversed String : " + reversed);
    }
    
}
