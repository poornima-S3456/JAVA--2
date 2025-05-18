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

    public static void main(String[] args){

        System.out.println( " totelways is :"+Friendspairing(3));
    }
    
}
