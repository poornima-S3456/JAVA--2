import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class questions {

    public static void main(String args[]){

    ArrayList<Integer>list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);


    //code1
        List<Integer>evensq = list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
    System.out.println(evensq);

    //code3
    int sum = list.stream().filter(n->n%2!=0).reduce(0,Integer::sum);
    System.out.println(sum);


   //code2
    ArrayList<String>name = new ArrayList<>();
    name.add("ram");
    name.add("shyam");
    name.add("om");
    name.add("sita");

    List<String>result = name.stream().filter(list2->list2.length()>3).map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(result);

//code4
    ArrayList<String>name2 = new ArrayList<>();
    name2.add("java");
    name2.add("stream");
    name2.add("API");

    List<Integer>lengths= name2.stream().map(String::length).collect(Collectors.toList());
    System.out.println(lengths);

//code5
    ArrayList<Integer>name3 = new ArrayList<>();
    name3.add(999);
    name3.add(1000);
    name3.add(1500);
    name3.add(1000);
    name3.add(2000);

    int totel= name3.stream().distinct().filter(p->p>1000).reduce(0,Integer::sum);
        System.out.println(totel);

//code6
    ArrayList<String>name4 = new ArrayList<>();
    name4.add("apple");
    name4.add("banana");
    name4.add("apricot");
    name4.add("cherry");

    long count = name4.stream().filter(s->s.toLowerCase().startsWith("a")).count();
    System.out.println(count);


    //code7
     ArrayList<String>name5 = new ArrayList<>();
    name5.add("jhon");
    name5.add("poornima");
    name5.add("priyanshi");
    name5.add("tony");

    String result1 = name5.stream().filter(o->o.length()>4).collect(Collectors.joining(","));
    System.out.println(result1);

    //code8
    ArrayList<Integer>name6 = new ArrayList<>();
    name6.add(10);
    name6.add(14);
    name6.add(22);
    name6.add(30);
    name6.add(45);

    boolean DivBy7 = name6.stream().anyMatch(r->r%7==0);
    System.out.println(DivBy7);



    //code9
     ArrayList<Integer>name7 = new ArrayList<>();
    name7.add(1);
    name7.add(2);
    name7.add(3);
    name7.add(4);

    int product = name7.stream().reduce(1,(a,b)->a*b);
    System.out.println(product);

}
}