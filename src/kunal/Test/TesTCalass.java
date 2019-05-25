package kunal.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesTCalass {
    static String value = "testify";
    static int value1 = 25;

    static {
        value1 = 50;
        System.out.println(value);
        System.out.println(value1); 
    }

    public static void main(String args[]){
    	List l = new ArrayList<>();
    	TesTCalass t = new TesTCalass();
    	TesTCalass t1 = new TesTCalass();
    	
    	l.add(t);
    	l.add(t1);
    	Collections.sort(l);
    	
    	for (int i = 0; i < l.size(); i++) {
    		System.out.println(l.get(i));
			
		}
    }

}