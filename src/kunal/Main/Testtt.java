package kunal.Main;

public class Testtt<T> {
    private T t;

    public static void main(String[] args) {
        Testtt obj = new Testtt();

        obj.set("Demo");
        obj.set(10);
        obj.set("%");
        System.out.println(obj.get());
        decreaseNumberByOne(2);
    }

    private static void decreaseNumberByOne(int i) {

        if (i>=0){
            decreaseNumberByOne(i-1);
        }
        System.out.println(i);
    }


    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

}
