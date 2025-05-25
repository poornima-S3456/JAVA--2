public class PracticeQ {

    //cyclic rotation
public static void rotateByOne(int arr[]){
int n = arr.length;
int last = arr[n-1];
for(int i = n-1;i>0;i--){
    arr[i]=arr[i-1];
}
arr[0]= last;
}

public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   
}
//find intersection of two sorted array

 public static void findIntersection(int arr1[],int arr2[]){
    int i =0;
    int j = 0;
    while(i<arr1.length && j<arr2.length){
        
        if(arr1[i]<arr2[j]){
          i++; 
        }
        else if(arr1[i]>arr2[j]){
           j++;
        }
        else{
            System.out.print(arr1[i]+" ");
            i++;
            j++;
        }
    } 
 }



 //Maximum product subarray

 
   // }
//    public static int pp()

//     int max = arr3[0];
//     int product = 1;

//     //left to right pass
//     for(int i=0;i<arr3.length;i++){
//         product*=arr3[i];
//         max = Math.max(max ,product);
//     }
//     product = 1;

//     //right to left pass

//     for(int i= arr3.length-1; i>=0;i--){
//         product*=arr3[i];
//         max = Math.max(max , product);
        
//         if(product==0){
//             product = 1;
//         }
//         return max;
            
//         }


public static void main(String args[]){


    // int arr3[]= { 2,3,-2,4};
    // System.out.println("Maximum product subarray  : "+maxproduct(arr3) );

int arr1[]= { 1,2,4,6,6};
int arr2[]= { 2,4,6,8};
System.out.println("intersection:  ");  
  findIntersection(arr1 , arr2);    


 

//     int arr[]={1,2,3,4,5,6};
//     System.out.print("Print original array = ");
//     printArray(arr);

//  rotateByOne(arr);
//   System.out.print("Array after rotation = ");
//    printArray(arr);
 }






    
}
