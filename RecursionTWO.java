public class RecursionTWO {

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



public static void RemoveDuplicate(String str,int idx,StringBuilder newstr,boolean map[] ){

    if( idx== str.length()){
System.out.println( newstr);
return;
    }

    //kam
    char currchar = str.charAt(idx);//jo hamara current char hem usko currchar me store kra diaa
           if( map[currchar-'a']==true){//agr true aata he to char duplicate he
            RemoveDuplicate( str,idx+1,newstr,map);
           }
           else{
            map[ currchar-'a']=true;
            RemoveDuplicate( str,idx+1,newstr.append(currchar),map);

           }
}

    public static void main(String args[]){
               // System.out.println(" Number of ways : "+tillingProblem(4) );
         String str = "heelloww";
        RemoveDuplicate(str,0,new StringBuilder(""),new boolean[26]);
 
    }
    
}
