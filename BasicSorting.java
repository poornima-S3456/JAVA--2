public class BasicSorting {
    public static void BubbleSort( int arr[]){   //bubble sort

        for( int turn=0;turn<arr.length-1;turn++){

            for( int j=0;j<arr.length-1-turn;j++){
                if( arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void Arrprint( int arr[]){

        for( int i=0;i<arr.length;i++){

            System.out.print( arr[i]+" ");
        }
        System.out.println();
    }


    public static void SelectionSort(int arr[]){  //Selection sort

        for( int i=0;i<arr.length-1;i++){//turn
            int minPos =i;
            for( int j=i+1;j<arr.length; j++){ //value compare

                if(arr[minPos]>arr[j] ){
                    minPos =j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i]=temp;




        }
    }

    public static void InsertionSort(int arr[]){   //Insirtion  sort
        for( int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev = i-1;
            //finding out the correct position to insert
           while( prev>=0 && arr[prev]>curr){
            arr[prev+1]= arr[prev];
            prev--;
           }
           //insertion
           arr[prev+1]=curr;

        }
    } 


  






    public static void main( String args[]){
         int arr[] = {3,8,7,5,4,2,9};
 // BubbleSort(arr);
 // Arrprint(arr);
  InsertionSort( arr);
  for( int i=0;i<arr.length;i++){

    System.out.print( arr[i]+" " );
  }
   
   
    }
     
    
    
}
