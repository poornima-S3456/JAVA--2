import java.util.*;

public class Alist {

    public static void main(String args[]){


      //using hashset
      int[]arr ={ 1,2,2,42,4,5,3,53,45,3,5};
  HashSet<Integer>set = new HashSet<>();

  int count =0;
//   arr1.add(1);
//   arr1.add(2);
//   arr1.add(2);
//   arr1.add(42);
//  arr1.add(4);
//  arr1.add(5);
//  arr1.add(3);
//  arr1.add(53);

//print all duplicate
  for( int i=0;i<arr.length;i++){
    if(set.contains(arr[i])){
System.out.println(" duplicate element = " +arr[i]);
count++;
   }
set.add( arr[i]);
 }
  System.out.println(set);
  System.out.println( count);




HashMap<Integer , Integer>map = new HashMap<>();
map.put(1,1);
map.put( 2,2);
map.put(3,3);
map.put(4,4);


//Foreach loop
map.forEach((key,value )->{
System.out.println( key+"   "+value);

});





System.out.println( map.containsKey(1));
System.out.println(map.get(2));
//System.out.println(map.remove(3));
System.out.println();

for(int Key : map.keySet()){
  if(Key>2){
  System.out.println(Key);

}}







  // TreeSet<String>set1 = new TreeSet<>();
  // set1.add("p");
  // set1.add("q");
  // set1.add("r");
  // set1.add("P");
  // set1.add("Q");
  // System.out.print(set1);


    //   ArrayList<Integer> list = new ArrayList<>();
    //   //add operation
    //   list.add(1);
    //   list.add(2);
    //   list.add(3);
    //   list.add(4);

    //   list.add( 1,9);
    //   list.add(2,8);
    //  System.out.println(list);

    // // get operation
    //  int element = list.get(3);
    //  System.out.println(element);


    // //  //remove element
    // list.remove(2);
    // System.out.println(list);

    //  //set element
    // // list.set(2,10);
    //  System.out.println(list);


//contain
// System.out.println(list.contains(2));
// System.out.println(list.contains(33));

    }


    
}
