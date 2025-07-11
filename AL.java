
import java.util.*;

 
public class AL {

 public static void swap(ArrayList<Integer>list , int idx1, int idx2){
        int temp = list.get(idx1);  //swapping
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
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
      System.out.println(" mainlist is = "+ mainList);

      //nested loops
      for(int i=0;i<mainList.size();i++){
        ArrayList<Integer>currList= mainList.get(i);

        for(int j=0;j<currList.size();j++){
          System.out.print(currList.get(j)+" ");
        }
        System.out.println();
      }

     


    //ascending order(Sorting)
   Collections.sort(list2);
  System.out.println("ascending order : "+list2);


 //descending order(Sorting)
Collections.sort(list2 , Collections.reverseOrder());
System.out.println(" descending order : "+list2);


   
  // for swapping
   int idx1 = 2, idx2 = 3;
   swap(list1,idx1,idx2);
   System.out.println( "Swapping : "+list1);


  //  //find maximum in arraylist
    int max = Integer.MIN_VALUE;
    for(int i=0;i<list1.size();i++){
        if(max<list1.get(i)){
          max = list1.get(i);
        }
    }
    System.out.println(" max element = "+max+ " " );
   System.out.println(" size of element = "+list1.size());



  //  // print the number of array list
  //   for(int i=0;i<list1.size();i++){
  //       System.out.print(list1.get(i)+" ");
  //   }
  //   System.out.println();


   // print reverse  O(n)time complexity

  //   for(int i=list2.size()-1;i>=0;i--){
  //       System.out.print(list2.get(i)+" ");
    
//}
//System.out.println();
}}
