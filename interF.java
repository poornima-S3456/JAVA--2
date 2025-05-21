
interface Animal{
    void makesound();
    void walk();
}
class Dog implements Animal{
    public void makesound(){
        System.out.println("bark");
    }
    public void walk(){
        System.out.println("walk");
    }
}


interface Runable{
    void run();
}
interface walkable{
    void walk();
}

class Human implements Runable , walkable{

     public void run(){
        System.out.println("run");
     }
     public void walk(){
        System.out.println("walk");
     }
}


interface A {
    void display();
}
interface B {
    void display();
}
    class Demo implements A,B{

        public void display(){
            System.out.println(" Display from demo");
        }
       
    }


    interface vehicle {
       default void start(){
        System.out.println( "vehicle is starting");
        }
    }
    class car implements vehicle{

    }
    interface shape{
     double area();
    }

    class Circle implements shape{
        double radius = 5;

        public double area(){
            return 3.14*radius*radius;
        }
    }
   


public class interF {
public static void main(String args[]){
        Dog d1 = new Dog();
      d1.makesound();

     Human h1 = new Human() ;
      h1.walk();


      Demo obj = new Demo();
        obj.display();

        car c1 =new car();
        c1.start();

        Circle  cir = new Circle ();
        cir.area();
        System.out.println(  "arera of circle "+cir.area());

      }
        }
   
