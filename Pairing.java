public class Pairing {
    public static int Friendspairing(int n){

        if(n==1||n==2){
            return n;
        }
        //single

         int fnm1 = Friendspairing(n-1);

         //pair
         int fnm2 = Friendspairing(n-2);
         int totelway = (n-1)*fnm2;

         return (n-1)+totelway;
    }

    //Binary string

    public static void printBinaryString( int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }

        printBinaryString( n-1,0,str+"0");
        if(lastplace==0){
            printBinaryString(n-1,1,str+"1");

       }
    }

    public static void main(String[] args){
        printBinaryString( 6, 0,"");

       System.out.println( " totelways is :"+Friendspairing(3));
    }
    
}
