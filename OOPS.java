public class OOPS {
    


public static void main( String args[]){
    School s1 = new School();
    s1.setname("    CM RISE HIGHER SECONDRY SCHOOL KATNI   ");
    System.out.println( s1.name);
    s1.setTeachers(12);
    System.out.println( " SPECIAL TEACHERS :"+s1.Teachers);
    s1.setClassrooms( 23);
    System.out.println( " NUMBER OF CLASSROOMS :"+ s1.classrooms);
    s1.setfees( 120000);
    System.out.println( " TOTEL FEES "+ s1.fees);
System.out.println();

 
}

//default constructor

class student




}
class School{
  String name;
     int Teachers;
  int classrooms;
    int classes;
    float fees;



    void setname( String name){

        this.name = name;
    }
   
    void setTeachers( int Teachers){

        this.Teachers = Teachers;
    }

    void setClassrooms( int Classrooms){
       classrooms = Classrooms;
    }

    void setclasses( int classes){

        this.classes = classes;
    }

    void setfees( float fees){

        this.fees = fees;
    }



}



  
   

