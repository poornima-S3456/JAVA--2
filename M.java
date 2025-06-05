import java.util.concurrent.ExecutionException;

//code 1
class MyThread extends Thread {
    public void run() {
        System.out.println("hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("hiii");
    }
}

// code2(without thread)
class downlodefile {
    public static void file(String file) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(file + " downloding..." + (i * 20) + "%");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
        System.out.println(file + "done...");
    }

}

// with thread
class Downloadfile extends Thread {
    String file;

    Downloadfile(String file) {
        this.file = file;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(file + " downloding..." + (i * 20) + "%");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
        System.out.println(file + "  done...");
    }

}

class MyRunnable implements Runnable {
    String file;
    MyRunnable(String file) {
        this.file = file;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(file + " downloding..." + (i * 20) + "%");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
        System.out.println(file + "  done...");
        }
  }



class Bank extends Thread{
 static int balance =1000;
    int withdraw ;

    public Bank(int withdraw ){
        this.withdraw = withdraw;
             }
    public void run(){
        synchronized(Bank.class){
        if( balance>=withdraw){
            System.out.println(withdraw);

            balance -= withdraw;
            System.out.println("remainng balance "+ balance);
        }
        else{
                System.out.println("So sorry.....");
        }
    }
    }

    }

class NewThread extends Thread{
    public void run(){

for(int i=0;i<10;i++){
    System.out.println(getName()+"is running...."+ getPriority());
    Thread.yield();

}
    }
}
 class SharedResources{
    boolean isDataReady = false;

  public  synchronized void produce(){

        System.out.println("producing data.....");
        try{
            Thread.sleep(2000);
            isDataReady = true;
            System.out.println( "data produce notifying consumer.....");
            notify();
        }catch(Exception e){
           
        }
    }


   public synchronized void consume(){
    System.out.println( " waiting for data,,,,");
    while(!isDataReady){
        try{
            wait();
        }catch(Exception e){

        }
    }
    System.out.println("data consume....");


    }

 } 

 



public class M {
       


  public static void main(String args[]) {

SharedResources s1 = new SharedResources();

//consumer thread
Thread d1 = new Thread(()->{
    s1.consume();

});

Thread d2 = new Thread (()->{

    s1.produce();
});

d1.start();
d2.start();




//     NewThread t2 = new NewThread();
//     NewThread t3 = new NewThread();

//     t2.setName("low priority");
//     t3.setName("high priority");

// t2.setPriority(Thread.MIN_PRIORITY );
// t3.setPriority(Thread.MAX_PRIORITY);
// t2.start();
// t3.start();


// System.out.println("idher dekho");
// Thread t1 = new Thread(()->{

//     System.out.println("hello jiii");
//     try{ System.out.println( " aaiyee");
// }catch(Exception e){

// }
// System.out.println("aaiiyeee");

// });

// Thread t4 = new Thread(()->{
//     System.out.println("welcome");

// });
// t1.start();
// t2.start();



        // Bank b1 = new Bank(500 );
        // Bank b2 = new Bank(800);
        // b1.start();
        // b2.start();
       
        // MyRunnable obj = new MyRunnable("File A");
        // MyRunnable obj1 = new MyRunnable("file B"  );
        // Thread t1 = new Thread(obj);
        // // Thread t2 = new Thread(obj);
        // t1.start();
       // t2.start();

        // try{
        //     t1.join();
        // }catch( InterruptedExeption e){
        //     e.printStackTrace();
        // }
        // for(int i=1;i<5;i++){
        //     System.out.println(i);
        // }
       //System.out.println("main thread is running");

        // downlodefile dn = new downlodefile();
        // dn.file("file A");
        // dn.file("file B");

        // Downloadfile d1 = new Downloadfile("file A");
        // Downloadfile d2 = new Downloadfile("file B");
        // d1.start();
        // d2.start();

        // MyThread t1 = new MyThread();
        // t1.start();
        // System.out.println("hiii");

    }

}
