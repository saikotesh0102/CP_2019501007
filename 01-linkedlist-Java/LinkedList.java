class Element{
	int value;
	Element next;
	public Element(int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList{
	Element head;
	public LinkedList(Element head){
		this.head = head;
	}

	public void append(Element new_element){
		// Your code goes here
		Element current = this.head;
		if(this.head != null){
			while(current.next != null){
				current = current.next;
			}
			current.next = new_element; 
		}else{
			this.head = new_element;
		}
	}

	public Element get_position(int position){
		// Get an element from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
		// Your code goes here
		Element current = this.head;
		int count = 0;
		while (current != null) { 
            if (count == position){
				return current;
			}
            count++; 
            current = current.next; 
        }
		return null;
	}

	public void insert(Element new_element, int position){
		// """Insert a new node at the given position.
		// Assume the first position is "1".
		// Inserting at position 3 means between
		// the 2nd and 3rd elements."""
		// Your code goes here
		if(position == 0){
			new_element.next = this.head;
			this.head = new_element;
		}else{
			Element current = this.head;
			while(--position > 0){
				current = current.next;
			}
			new_element.next = current.next;
			current.next = new_element;
		}
	}

	public void delete(int value){
		// Delete the first node with a given value.
		// Your code goes here
	}

	public static void main(String[] args) {
		
	}
}
