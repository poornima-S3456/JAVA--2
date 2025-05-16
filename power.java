public class power {

    public static int optimizedpower( int a,int n){


        if(n==0){
            return 1;
        }

        int halfpowsq = optimizedpower(a,n/2)* optimizedpower(a,n/2);

        //n is odd

        if(n % 2 != 0){


            halfpowsq = a*halfpowsq;
        }
        return halfpowsq;
    }


    public static void main(String args[]){



        int a=2;
        int n = 6;
        System.out.println(  optimizedpower(a,n));
    }
    
}
