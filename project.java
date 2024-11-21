import java.util.*;

class thread extends Thread{
    static int number=1;
}
class thread1 extends thread{
    public void run(){
        for(int i=0;i<10;++i){
            number+=156;
            System.out.println(number+" ");
        }
    }
}
class thread2 extends thread{
    public void run(){
        for(int i=0;i<10;++i){
            number*=3;
            System.out.println(number+" ");
        }
    }
}

public class project{
    static int random(){
        thread t1=new thread1();
        thread t2=new thread2();
        // t1.start();
        t2.start();
        try{
            Thread.sleep(50);
        }
        catch(Exception e){
            System.out.println("error");
            return 0;
        }
        return thread.number;
    }
    public static void main(String[] args) {
        random();
        // System.out.println(random());
        System.out.println(thread.number);
    }
}