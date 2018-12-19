/**
 * Created by kv58935 on 12/1/2018.
 */
public class T1 {
    void abc() {
        System.out.println("ABC funtion");
    }
    void lmn() {
        System.out.println("LMN funtion");
    }
}


class T2 extends T1 {

    void def() {
        System.out.println("DEF funtion");
    }
    void abc() {
        System.out.println("ABC in T2 funtion");
    }


    public static void main(String[] args) {
        T1 t = new T2();
        T2 t2 = new T2();
        T1 t1_1 = new T2();
        t.abc();
        t2.abc();
        t1_1.lmn();
//        T1 t2 = new T3();
//        T1 t11 = new T2();
//        T1 testInheritance = new T2();
//        T2 t1 = new T3();
//        T3 t3 = new T3();
//        t.def();
//        t.abc();
//        testInheritance.abc();
//        t2.abc();
//        t3.cef();
//        t1.abc();
//        t1.def();
    }
}

class T3 extends T2 {
    void cef() {
        System.out.println("CEF funtion");
    }

    /*public static void main(String[] args) {
        T1 t = new T2();
        t.abc();
//        T1 t2 = new T3();
//        T1 t11 = new T2();
//        T1 testInheritance = new T2();
//        T2 t1 = new T3();
//        T3 t3 = new T3();
//        t.def();
//        t.abc();
//        testInheritance.abc();
//        t2.abc();
//        t3.cef();
//        t1.abc();
//        t1.def();
    }*/

}