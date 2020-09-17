package kunal.Main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HashTest {

    private String str;

    public HashTest(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }

    public static void main(String args[]) {
        HashTest h1 = new HashTest("2");
        String s1 = new String("1");

        List<Object> list = new LinkedList<Object>();
        list.add(h1);
        list.add(s1);

        //Collections.sort(list);
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
