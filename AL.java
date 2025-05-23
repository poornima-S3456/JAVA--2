import java.util.ArrayList;
import java.util.Collections;
 public class AL {

//  public static void swap(ArrayList<Integer>list , int idx1, int idx2){
//         int temp = list.get(idx1);  //swapping
//         list.set(idx1,list.get(idx2));
//         list.set(idx2,temp);

//     }
   public static void main(String args[]){
    ArrayList<Integer>list= new ArrayList<>();
    list.add(7);
    list.add(6);
    list.add(3);
    list.add(8);
    list.add(9);
   System.out.println(list);

   //ascending order(Sorting)
   Collections.sort(list);
  System.out.println(list);


//descending order(Sorting)
Collections.sort(list , Collections.reverseOrder());
System.out.println(list);


   
   //for swapping
  //  int idx1 = 2, idx2 = 3;
  //  swap(list,idx1,idx2);
  //  System.out.println(list);


  //  //find maximum in arraylist
    // int max = Integer.MIN_VALUE;
    // for(int i=0;i<list.size();i++){
    //     if(max<list.get(i)){
    //       max = list.get(i);
    //     }
    // }
    // System.out.println(" max element "+max+ " " );



    //System.out.println(list.size());

    //print the number of array list

    // for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i)+" ");
    // }
    // System.out.println();


    //print reverse  O(n)time complexity

//     for(int i=list.size()-1;i>=0;i--){
//         System.out.print(list.get(i)+" ");
    
// }
// System.out.println();
}}
