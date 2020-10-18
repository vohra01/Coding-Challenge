package kunal.Main;

class HackerEarth2 {

    static int j = 20; 

    public static void main(String argv[]) {

        int i = 10; 
        HackerEarth2 h = new HackerEarth2();
        h.programming(i); 
        System.out.print(i + ", "); 
        System.out.println(j); 
    }

    public void programming(int x) { 
        x = x*2; 
        j = j*2; 
    } 
}
