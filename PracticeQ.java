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


public static void main(String args[]){

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
