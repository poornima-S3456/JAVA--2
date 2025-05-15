public class Subarray {

    public static void kadane(int numbers[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for( int i=0;i<numbers.length;i++){
           cs = cs + numbers[i];
           if( cs<0){
            cs=0;
           }
           ms = Math.max( cs,ms);

        }
        System.out.println(" max subarry sum is = "+ ms);
        System.out.println( " current sum  = " + cs);

    }
    public static void main( String[] args){
        int numbers[] = { 2,-2,7,-4,9,-3};
        kadane( numbers);
    }
    
}
