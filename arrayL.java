import java.util.*; 

class Student implements Comparable<Student>{
int age;
String name;

public Student(int age , String name){
    this.age= age;
    this.name = name;

}

public String toString() {
    return age+" "+name;
}

public int compareTo(Student s){
    return this.age - s.age;
}

}


class Student1{

    int age;
    int rollnum;
    String name;

    public Student1(int age,int rollnum,String name){
        this.age = age;
        this.rollnum = rollnum;
        this.name = name;
    }

    public String toString(){
        return age+" "+rollnum+" "+name;

    }
} 

class sortByname implements Comparator<Student1>{
    public int compare(Student1 s1 , Student1 s2){
        return s1.name.compareTo(s2.name);
    }
}
class sortByrollnum implements Comparator<Student1>{
    public int compare(Student1 s1 , Student1 s2){
        return Integer.compare(s1.rollnum, s2.rollnum);
    }
}
class sortByage implements Comparator<Student1>{
    public int compare(Student1 s1 , Student1 s2){
        return Integer.compare(s1.age,s2.age);
    }
}

public class arrayL {
    public static void main(String args[]){
ArrayList<Student1>list = new ArrayList<>();
list.add(new Student1(12,5 ,"rahul"));
list.add(new Student1(13,6,"rohit"));
list.add(new Student1 (14,7,"mohit"));
list.add(new Student1(7,8,"ankita"));

// Collections.sort(list);
// for(Student s : list){
// System.out.println(s.toString());

//     }

Collections.sort(list, new sortByname());
System.out.println( " sort by name: ");
for(Student1 s :list){
    System.out.println(s);
}
 System.out.println();
Collections.sort(list, new sortByage());
System.out.println(" sort by age: ");
for(Student1 s :list){
    System.out.println(s);
}
System.out.println();
Collections.sort(list, new sortByrollnum());
System.out.println("sort by rollnum: ");
for(Student1 s :list){
    System.out.println(s);
}

    }
    
}
