public class RecursionTWO {

static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine", "ten"};    //print digit
public static void printdigits(int number){
    if(number==0){

        return;
    }

    int lastdigit = number%10;
    printdigits(number/10);
    System.out.print(digit[lastdigit]+" ");
}



//tillingproblem
    public static int tillingProblem( int n){

        if(n==0||n==1){

            return 1;
        }


      //  vertical
      int fnm1 = tillingProblem(n-1);

      //horizontal
      int fnm2 = tillingProblem(n-2);

      int totways = fnm1+fnm2;
      return totways;
      }  

//remove duplicate

public static void RemoveDuplicate(String str,int idx,StringBuilder newstr,boolean map[] ){

    if( idx== str.length()){
System.out.println( newstr);
return;
    }

    
    char currchar = str.charAt(idx);
           if( map[currchar-'a']==true){
            RemoveDuplicate( str,idx+1,newstr,map);
           }
           else{
            map[ currchar-'a']=true;
            RemoveDuplicate( str,idx+1,newstr.append(currchar),map);

           }
}


//chech occurence
public static void alloccurence( int arr[],int key,int i){

    if(i==arr.length){

       return;
    }
    if(arr[i]==key){
        System.out.println(i+" ");
    }
    alloccurence( arr,key,i+1);
}

//length

public static int length(String str){
    if(str.length()==0){

        return 0;
    }

    return length(str.substring(1))+1;
}


//cyclicrotation
public static void cyclicrotation(int arr[]){
 int n = arr.length;
 int last = arr[n-1];

 for( int i=n-1;i>0;i--){
    arr[i]=arr[i-1];
 }

 arr[0]=last;


}

//negativearray
public static void negativearray(int arr[]){
for( int i=0;i<arr.length;i++){
 for( int j=i+1;j<arr.length;j++){
    if(arr[i]>arr[j]){

    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]= temp;
 }
  }
}
int[] temp = new int[arr.length];
int index = 0;
for(int i=0;i<arr.length;i++){
    if(arr[i]<0){
        temp[index++]=arr[i];
    }
}
for( int i=0;i<arr.length;i++){
    if(arr[i]>=0){
        temp[index++]=arr[i];
    }
}
for(int i=0;i<arr.length;i++){
    arr[i]=temp[i];
}
}    public static void main(String args[]){

         int arr[]={ -4,-3,0,9,7,-5,0};
    negativearray(arr);
    for( int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");


 // System.out.println(" Number of ways : "+tillingProblem(4) );
        // String str = "hello";

       // RemoveDuplicate(str,0,new StringBuilder(""),new boolean[26]);
     //t arr[]={ 3,2,4,5,6,2,7,2,3};
    //nt key = 2;
      
       //loccurence(arr,key, 0);
      //ystem.out.println();


     //  printdigits(1947);
     

    //  int arr[]={ 1,2,3,4,5};
    //  cyclicrotation(arr);
    //  for( int i=0;i<arr.length;i++){
    //  System.out.print(arr[i]+" ");
    // }
  //  } 
    


    // String str ="abcde";
    // System.out.println(length(str));

    }
    }}
