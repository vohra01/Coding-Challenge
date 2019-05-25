package kunal.Test;
import java.util.*;

public class SortByFrequency {
    
    static void sortByFreq(List<Integer> a){
        Map<Integer, Integer> map = new TreeMap<> ();
        
       /* Logic to place the elements to Map */
       for(int i=0; i<a.size(); i++){
           if(map.get(a.get(i)) == null){
               map.put(a.get(i), 1);
            }
           else{
               int frequency = map.get(a.get(i));
               map.put(a.get(i), frequency+1);
           }
       }
       
       //System.out.println(map);
       
       List list = new LinkedList(map.entrySet());
       
       /* Sort the list elements based on frequency */
       Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
               return ((Comparable) ((Map.Entry) (obj1)).getValue())
                  .compareTo(((Map.Entry) (obj2)).getValue());
            }
       });
       
       int count=0;
       
       /* Place the elements in to the array based on frequency */
       for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            
            int key = (int)entry.getKey();
            int val = (int)entry.getValue();
            
            for(int i=0; i < val; i++){
                a.add(count,key);//= key;
                count++;
            }            
       } 
       
       for (int i = 0; i < a.size()/2; i++) {
		System.out.println(a.get(i));
	}
    }
    
    public static void main(String args[]){
        int a[] = {5,4,3,2,1,0,5,3,2,4,1,2,3,5};
        
        System.out.println("Before Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
        
        sortByFreq(a);
        
        System.out.println("\nAfter Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
    }
}