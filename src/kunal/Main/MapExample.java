package kunal.Main;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

//    public static void main(String[] args) {
//
//        Map hm = new HashMap();
//
//        hm.put("abc", 1);
//        //hm.put("abc", k-> getLength(k));
//        //hm.put("def", k-> getLength(k));
//
//
//
//
//    }


    public static void main(String []aa)
    {
        new B2().add();
    }
    private static int getLength(String s){
        return s.length();
    }


}


class B1
{
    public B1(){}

    private int a=10;  /**Line A**/
protected int b=30;

    protected void sum()
    {
        new B1().get();
    }
    private void  get()   /**Line B**/
    {
        System.out.println(a+b);
    }
}

class B2 extends B1
{
    protected int c=10;

    protected void add()
    {
        sum();   /**Line C**/
    }

}
