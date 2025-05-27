import java.util.Scanner;


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


 
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    //Take array input
    System.out.print("Enter the number of element : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.print("Enter the elements :");
    for(int i=0; i<n;i++){

        arr[i]= sc.nextInt();
       }

       //initializing min and max 
       int max = arr[0];
       int min = arr[0];


       //finding min and max
       for(int i=1; i<n;i++){
          
        if(arr[i]>max){
            max = arr[i];
        }
        if (arr[i]<min){
            min = arr[i];
        }
     }
     System.out.println(  "Maximum element : "+ max);
     System.out.println( "Minimum element : " + min);


















    // int n =4;
    // int[][] pascal = new int[n][n];

    // for(int i=0;i<n;i++){
    //    pascal[i][0]= 1;

    //     for( int j=1;j<=i ; j++){
    //         pascal[i][j]= pascal[i-1][j-1]+ pascal[i - 1][j];
    //     }
    // }
    // //print
    // for(int i=0 ; i<n ; i++ ){
    //     for(int space =0; space<n-i-1;space++){
    //         System.out.print(" ");
    //     }

    //     for(int j=0;j<=i;j++){
    //    System.out.print(pascal[i][j]+" " );

    //     }
    //     System.out.println();
    // }


















//         Scanner sc = new Scanner( System.in);
//     //take matrix size from user
//     System.out.print(" Enter number of rows :");
//     int rows = sc.nextInt();

//     System.out.print( "Enter number of column");
//     int cols = sc.nextInt();

// // declare original matrix
//     int[][] matrix = new int[rows][cols];

//     //intput matrix element 
//     System.out.println(" Enter matrix elements :");
//         for( int i=0;i<rows ; i++){
//          for(int j=0; j<cols ; j++){

//     matrix[i][j]= sc.nextInt();
    
//          }
//              }
// //print original matrix

// System.out.println(" original matrix");

// for(int i=0; i<cols; i++){

//     for( int j=0; j<cols;j++){

//         System.out.print(matrix[i][j]+"   ");
//     }
//     System.out.println();
// }

// //Transpose matrix
// int[][] transpose = new int [cols][rows];
// for(int i=0;i<cols;i++){
//     for(int j=0; j<rows ; j++){
//       transpose[i][j]=matrix[j][i];

//     }
// }
// //print transpose matrix 
// System.out.println(  "Transpose matrix");
// for( int i=0;i<cols;i++){
//     for(int j=0;j<rows;j++){
// System.out.print( transpose[i][j]+"  ");
//     }
//     System.out.println();
// }
// sc.close();








   



    
    
// // int arr1[]= { 1,2,4,6,6};
// // int arr2[]= { 2,4,6,8};
// // System.out.println("intersection:  ");  
// //   findIntersection(arr1 , arr2);    


 

// //     int arr[]={1,2,3,4,5,6};
// //     System.out.print("Print original array = ");
// //     printArray(arr);

// //  rotateByOne(arr);
// //   System.out.print("Array after rotation = ");
// //    printArray(arr);
  }
}

    

