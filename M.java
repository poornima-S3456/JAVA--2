import java.util.concurrent.ExecutionException;


//code 1
class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(2000);
        }catch( Exception e){
            
        }
       System.out.println( "hiii");
    }
}


//code2
class downlodefile{
    public static void file(String file){
        for(int i=1;i<=5;i++){
            System.out.println(file+ " downloding..." + (i*20)+ "%");
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
    }
        System.out.println(file + "done...");
    }
    
}

class Downloadfile extends Thread{
    String file;

    Downloadfile( String file){
        this.file= file;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(file+ " downloding..." + (i*20)+ "%");
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
    }
        System.out.println(file + "  done...");
    }
    


}


public class M {


    public static void main(String args[]){

        // downlodefile dn = new downlodefile();
        // dn.file("file A");
        // dn.file("file B");

        Downloadfile d1 = new Downloadfile("file A" );
        Downloadfile d2 = new Downloadfile("file B" );
        d1.start();
        d2.start();
        


    //  MyThread t1 = new MyThread();
    //  t1.start();
    //  System.out.println("hiii");



    }


    
}
