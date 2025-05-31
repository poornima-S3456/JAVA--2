
public class DSA {

    public static void reverse(int arr[]){

        int start =0;
        int end = arr.length-1;

        while(start<end){

            //swap arr[start] and arr[end]
             int temp= arr[start];
             arr[start]=arr[end];
             arr[end]= temp;

             start++;
             end--;
        }
    }

    public static void main(String args[]){

int arr[]= {5,4,3,2,1};
reverse(arr);

//print reverse array

System.out.println( "reverse an array in place :");

for(int i=0;i<arr.length;i++){

    System.out.print(arr[i] + " ");
}

    }


    
}
