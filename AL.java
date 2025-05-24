import java.util.ArrayList;
import java.util.Collections;
 public class AL {

//  public static void swap(ArrayList<Integer>list , int idx1, int idx2){
//         int temp = list.get(idx1);  //swapping
//         list.set(idx1,list.get(idx2));
//         list.set(idx2,temp);

//     }
   public static void main(String args[]){
    //code1
    ArrayList<ArrayList<Integer>>mainList= new ArrayList<>();
    ArrayList<Integer>list1= new ArrayList<>();
    ArrayList<Integer>list2= new ArrayList<>();
    ArrayList<Integer>list3= new ArrayList<>();

    for(int i=1;i<=5;i++){

      list1.add(i*1);//1,2,3,4,5
      list2.add(i*2);//2,4,6,8,10
      list3.add(i*3);//3,6,9,12,15
    }
      mainList.add(list1);
      mainList.add(list2);
      mainList.add(list3);
      System.out.println(mainList);

     


//    //ascending order(Sorting)
//    Collections.sort(list);
//   System.out.println(list);


// //descending order(Sorting)
// Collections.sort(list , Collections.reverseOrder());
// System.out.println(list);


   
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
