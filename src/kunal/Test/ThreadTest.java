package kunal.Test;

/**
 * Created by kv58935 on 12/13/2018.
 */
public class ThreadTest extends Thread{

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}


class ThreadDemo{
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        for (int i = 0; i<10; i++){
            System.out.println("Parent Thread");
        }
    }
}