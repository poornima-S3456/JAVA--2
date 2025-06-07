import java.util.*;
public class hashset {
    public static void findPairs(int arr[],int sum){
    HashSet<Integer>set = new HashSet<>();
    for(int num:arr){
        int complement = sum-num;
        if(set.contains(complement)){
            System.out.println("(" + num + "," + complement + ")");

        }
        set.add(num);
    }
    }
    public static void main(String args[]){
        int arr[]={1,4,5,6,3,2};
        int target = 7;
        findPairs(arr,target);
    }
    
}
