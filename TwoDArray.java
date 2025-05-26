import java.util.*;


public class TwoDArray {

public static void printDiagonals (int[][]arr){
int n = arr.length;
System.out.println("primary diagonal: ");

for(int i=0; i<n; i++){
    System.out.println(arr[i][i] + " ");
}

System.out.println( "\nSecondary diagonal: ");
for(int i=0; i<n; i++){
    System.out.println( arr[i][n-1-i]+ "  ");
}

}

    public static void main( String args[]){
        int arr[][]= {{1 , 2 , 3},
                      { 4 , 5 , 6},
                      { 7 , 8 , 9 }     };
                      printDiagonals(arr);

       }



//         int matrix[][]= new int[3][3];
//         int n= matrix.length , m= matrix[0].length;
//         Scanner sc = new Scanner( System.in);
//         for( int i=0;i<n;i++){

//             for( int j=0;j<m;j++){

//                 matrix[i][j]=sc.nextInt();
//             }
//         } 

//         for( int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+ " ");
//             }
//             System.out.println();
//         }

     }
    
 
