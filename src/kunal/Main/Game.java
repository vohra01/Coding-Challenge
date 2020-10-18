package kunal.Main;

class Game {
    public int number;
}

 class HackerEarth123 {
    public void PlayIt(int i , Game p){
        i = 5;
        p.number = 8;
    }

    public static void main(String args[]){
        int x = 0;
        Game p = new Game();
        new HackerEarth123().PlayIt(x, p);
        System.out.println(x + " " + p.number);
    }
}
