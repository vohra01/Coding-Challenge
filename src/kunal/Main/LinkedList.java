package kunal.Main;

import java.util.ArrayList;
import java.util.Collection;

class Node12 {
	Object data;// Object data
	Node12 next;
		
	Node12(Object d){
		this.data = d;
		this.next = null;
	}
}

public class LinkedList {
	Node12 first = null;
	Node12 last = null;
	
	int length = 0;
	
	public boolean add(Object o) {
		if(o == null)
			return false;
		Node12 newNode12 = new Node12(o);
		this.length++;
		
		// this case if the list is empty
		if( this.first == null ) {
			this.first = newNode12;
			this.last = newNode12;
		} else {
			this.last.next = newNode12;
			this.last = newNode12;
		}
		return true;
	}
	
	public boolean add(int index, Object o) {
		if(o == null)
			return false;
		
		Node12 newNode12 = new Node12(o);
		int i = 0;
		
		Node12 temp = this.first;
		
		if(index == 0) {
			this.first = newNode12;
			this.first.next = temp;
			
			this.length++;
			return true;
		}
		
		if(index < this.length) {
			while(i < index - 1) {
				temp = temp.next;
				i++;
			}
			Node12 nextNode12 = temp.next;
			temp.next = newNode12;
			newNode12.next = nextNode12;
			
			this.length++;
			return true;
		}
		throw new IndexOutOfBoundsException("There is no element for index : " + index);
		//return null;
	}
	
	public boolean addAll(Collection<Object> collectionList) {
		if( collectionList.isEmpty() )
			return false;
		
		for(Object o : collectionList) {
			this.add(o);
		}
		return true;
	}
	
	public boolean addAll(int index, Collection<Object> collectionList) {
		if( collectionList.isEmpty() )
			return false;
		
		int plusLength = 0;
		LinkedList auxList = new LinkedList();
		for(Object o : collectionList) {
			auxList.add(o);
			plusLength++;
		}
		
		if(index == 0) {
			Node12 copyList = this.first;
			
			auxList.last.next = copyList;
			this.first = auxList.first;
			
			this.length += plusLength;
			return true;
		}
		
		Node12 temp = this.first;
		int i = 0;
		
		if(index < this.length) {
			while(i < index - 1) {
				temp = temp.next;
				i++;
			}
			
			Node12 nextNode12 = temp.next;
			auxList.last.next = nextNode12;
			temp.next = auxList.first;
			
			this.length += plusLength;
			return true;
		}
		throw new IndexOutOfBoundsException("There is no element for index : " + index);
		//return null;
		
	}
	
	public void addFirst(Object o) {
		if(o == null)
			return;
		
		Node12 newNode12 = new Node12(o);
		newNode12.next = this.first;
		this.first = newNode12;
		this.length++;
		
		return;
	}
	
	public void addLast(Object o) {
		if(o == null)
			return;
		
		Node12 newNode12 = new Node12(o);
		
		if(this.last == null) {
			this.first = newNode12;
			this.last = newNode12;
			this.length++;
			return;
		}
		
		this.last.next = newNode12;
	}
	
	public void clear() {
		this.last = null;
		this.first = null;
		this.length = 0;
	}
	
	public ArrayList<Object> clone(){
		ArrayList list = new ArrayList<>();
		
		Node12 temp = this.first;
		
		while(temp != null) {
			list.add(temp);
			temp = temp.next;
		}
		
		return list;
	}
	
	public void printList() {
		Node12 temp = this.first;
		while(temp != null) {
			System.out.print( temp.data + " ");
			temp = temp.next;
		}
	}
	
}