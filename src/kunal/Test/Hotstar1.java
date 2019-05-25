package kunal.Test;

import java.util.*;

public class Hotstar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, Integer> festCost = new Hashtable<String, Integer>();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // Test Cases
		int n = in.nextInt(); // Test Cases
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n; j++) {
			//while (in.hasNext()) {
				String fest = in.next()+i;
				int cost = in.nextInt();
				festCost.put(fest, cost);
			//}
		}
		}
		sortValue(festCost);
	}

	public static void sortValue(Hashtable<String, Integer> t) {

		// Transfer as List and sort it
		ArrayList<Map.Entry<?, Integer>> l = new ArrayList(t.entrySet());
		Collections.sort(l, new Comparator<Map.Entry<?, Integer>>() {

			public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}});

		Hashtable<String, Integer> a = new Hashtable<String, Integer>();
		//a.putAll(l);

//System.out.println(l);
	}

	public String method(String str) {
	    if (str != null && str.length() > 0) {
	        str = str.substring(0, str.length() - 1);
	    }
	    return str;
	}
	
	public void calc(Hashtable<String, Double> hashtable) {
	    Map<String, Double> hm = new HashMap<>();
	    
	    
	    Set<String> keys = hashtable.keySet();
        for(String key: keys){
        	Double finalPrice = hashtable.containsKey(key) ? hashtable.get(key) : -1D;
        	finalPrice += hashtable.get(key);
        }
          
	    
	   /* for (Pet i : pets) {
	        String name = i.getShop();
	        // If the map already has the pet use the current value, otherwise 0.
	        double price = hm.containsKey(name) ? hm.get(name) : 0;
	        price += i.getPrice();
	        hm.put(name, price);
	    }
	    System.out.println("");
	    for (String key : hm.keySet()) {
	        System.out.printf("%s: %.2f%n", key, hm.get(key));
	    }*/
	}
}
