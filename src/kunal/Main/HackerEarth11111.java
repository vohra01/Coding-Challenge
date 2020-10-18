package kunal.Main;

class HackerEarth11111 extends Thread{

    public static void main(String[] args) {
        Thread hack = new Thread("Hack");
        Thread hack1 = new Thread("Hack1");
        try {
            hack.join();
            hack1.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted.");
        }
    }

    public void run(){
        System.out.println("Run executed");
    }
}
