package kunal.Test;






public class Paramati3 {    
    static void getMostFrequentElement(String  inputArray[])
    {
        //Creating HashMap object with elements as keys and their occurrences as values
         
    	java.util.HashMap<String, Integer> elementCountMap = new java.util.HashMap<String, Integer>();
         
        //Inserting all the elements of inputArray into elementCountMap
         
        for (String i : inputArray) 
        {
            if (elementCountMap.containsKey(i))
            {
                //If an element is present, incrementing its count by 1
                 
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If an element is not present, put that element with 1 as its value
                 
                elementCountMap.put(i, 1);
            }
        }
        //String temp [] = new String {"j" "a" "z"};
        String temp [] = {"a", "b", "c"};

       // String temp [] = { "j " " b" "c"};

        String element ="";
         
        int frequency = 1;
         
        //Iterating through elementCountMap to get the most frequent element and its frequency
         
        java.util.Set<java.util.Map.Entry<String, Integer>> entrySet = elementCountMap.entrySet();
         
        for (java.util.Map.Entry<String, Integer> entry : entrySet) 
        {
            if(entry.getValue() > frequency)
            {
                element = entry.getKey();
                 
                frequency = entry.getValue();
            }
        }
         
        //Printing the most frequent element in array and its frequency
         
        if(frequency > 1)
        {
            System.out.println("Input Array : "+java.util.Arrays.toString(inputArray));
             
            System.out.println("The most frequent element : "+element);
             
            System.out.println("Its frequency : "+frequency);
             
            System.out.println("========================");
        }
        else
        {
        	java.util.Arrays.sort(inputArray);
        	int a  = inputArray.length;
        	
            System.out.println("Input Array : "+java.util.Arrays.toString(inputArray));
            System.out.println();
             
            System.out.println("No frequent element. All elements are unique.");
             
            System.out.println("=========================");
        }
    }
     
    
    public static int divide(int a, int b) {
        int c = -1;
        
        try {
            c = a / b;
        } 
        catch (Exception e) {
            System.err.print("Exception ");
        } 
        finally {
            System.err.println("Finally ");
        }
        
        return c;
    }
    
    
    public static void main(String[] args)
    {
    	divide(5,50);
         
    }
}

