public class BasicSorting {
    // public static void BubbleSort( int arr[]){   //bubble sort

    //     for( int turn=0;turn<arr.length-1;turn++){

    //         for( int j=0;j<arr.length-1-turn;j++){
    //             if( arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j]= arr[j+1];
    //                 arr[j+1]= temp;
    //             }
    //         }
    //     }
    // }

    public static void Arrprint( int arr[]){

        for( int i=0;i<arr.length;i++){

            System.out.print( arr[i]+" ");
        }
        System.out.println();
    }


    // public static void SelectionSort(int arr[]){  //Selection sort

    //     for( int i=0;i<arr.length-1;i++){//turn
    //         int minPos =i;
    //         for( int j=i+1;j<arr.length; j++){ //value compare

    //             if(arr[minPos]>arr[j] ){
    //                 minPos =j;
    //             }
    //         }
    //         //swap
    //         int temp = arr[minPos];
    //         arr[minPos]= arr[i];
    //         arr[i]=temp;




    //     }
    // }

    // public static void InsertionSort(int arr[]){   //Insirtion  sort
    //     for( int i=1;i<arr.length;i++){
    //         int curr =arr[i];
    //         int prev = i-1;
    //         //finding out the correct position to insert
    //        while( prev>=0 && arr[prev]>curr){
    //         arr[prev+1]= arr[prev];
    //         prev--;
    //        }
    //        //insertion
    //        arr[prev+1]=curr;

    //     }
    // } 

    // //merge sort

    public static void mergesort( int arr[],int si,int ei){
//base case
        if(si>=ei){
    return;
}
        int mid = si+(ei-si)/2;
        mergesort(arr,si,mid);//left part
        mergesort(arr,mid+1,ei);//right part
        merge( arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
//left(0,3)=4 right(4,6)=3 6-0

int temp[]= new int[ei-si+1];

int i=si;//iterator for left part
int j= mid+1;//iterator for right part
int k=0;//iterator for temp arr

while(i<=mid && j<=ei){
    if(arr[i]<arr[j]){
    
        temp[k]=arr[i];
        i++; k++;

    }else{

        temp[k]=arr[j];
        j++; k++;
    }
   
}

//left part
while(i<=mid){
    temp[k++]=arr[i++];
}

//right part
while(j<=ei){
    temp[k++]=arr[j++];
    }

    //copy temp to original array
   for( k=0,i=si;k<temp.length;k++,i++){
    arr[i]= temp[k];
    }

    }

    public static void main( String args[]){
         int arr[] = {3,8,7,5,4,2,9};
 // BubbleSort(arr);
//  Arrprint(arr);
//   InsertionSort( arr);
mergesort( arr,0,arr.length-1);
for(int i=0;i<arr.length;i++){
  System.out.print( arr[i]+" ");
}

 
    }
    }
     
    
    
