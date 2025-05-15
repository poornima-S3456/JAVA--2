public class Recursion {


    public static int firstOccurence( int arr[] , int key,int i){//firstOccurence
       if(i==arr.length){
        return -1;
       }
       if(arr[i]==key){
        return i;
       }
       return firstOccurence( arr, key,i+1 );

    }

//last occurence
 public static int lastOccurence( int arr[],int key,int i){
if( i==arr.length){
    return -1;
}

int isfound = lastOccurence( arr,key,i+1);

if( isfound==-1 && arr[i]==key){
    return i;
}
return isfound;

    }

    //x ki power n

    public static int power( int x, int n){


        if( n == 0){

            return 1;
        }

        int xnm1 = power( x,n-1);
        int xn = x* xnm1;
        return xn;
    }











    public static void main(String args[]){
        int arr[]={ 2,4,6,8,7,9,3,2,1,7};
       // System.out.println(firstOccurence( arr,7,0) );
       // System.out.println(  lastOccurence( arr,2,0));

      System.out.println(power( 3,2));
      
    }
    
}
