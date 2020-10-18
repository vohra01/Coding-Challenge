package kunal.Main;


public class CustomHashMap<K, V> {

    private int capacity = 16; //Initial default capacity

    private Entry<K, V>[] table; //Array of Entry object

    public CustomHashMap() {
        table = new Entry[capacity];
    }

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    public void put(K key, V value) {
        int index = index(key);
        Entry newEntry = new Entry(key, value, null);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> previousNode = null;
            Entry<K, V> currentNode = table[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null)
                previousNode.setNext(newEntry);
        }
    }


    public V get(K key) {
        V value = null;
        int index = index(key);
        Entry<K, V> entry = table[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    //Remove is not needed in our question but added if you feel needed
    public void remove(K key) {
        int index = index(key);
        Entry previous = null;
        Entry entry = table[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                if (previous == null) {
                    entry = entry.getNext();
                    table[index] = entry;
                    return;
                } else {
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Entry<K, V> currentNode = table[i];
                while (currentNode != null) {
//                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    System.out.println(currentNode.getKey() + " " + currentNode.getValue());
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }
}

//This is most important class to add
class Entry<K, V> {

    private K key;
    private V value;
    private Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}


//This is main class. It isnt needed
class HashMapRunner {

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<String , Integer>();
        System.out.println("Going to add entries in map");
        map.put("zees", 4);
        map.put("Ani", 6);
        map.put("Ani", 8);
        map.put("Luh", 10);
        map.put("Rag", 20);
        System.out.println("Displaying all the entry in map");
        map.display();
        System.out.println("Removing the entry with key 2");
        System.out.println("Adding duplicate key 1 in map");
    }
}
