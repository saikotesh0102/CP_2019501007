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
		while(current.next != null){
			current = current.next;
		}
		current.next = new_element;
		new_element.next = null;
	}

	public Element get_position(int position){
		// Get an element from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
		// Your code goes here
		Element current = this.head;
		int count = 0;
		while (current != null) { 
            if (count == position - 1){
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
		Element current = this.head;
		int count = 0;
		while (current != null) {
			count++;
            if (count == position - 1){
				Element temp = current.next;
				current.next = new_element;
				new_element.next = temp;
			}
            current = current.next; 
        }
	}

	public void delete(int value){
		// Delete the first node with a given value.
		// Your code goes here
		Element current = this.head;
		Element previous = null;
		if(current != null && current.value == value){
			this.head = current.next;
			return;
		}
		while(current != null && current.value != value){
			previous = current;
			current = current.next; 
		}
		if(current == null){
			return;
		}
		previous.next = current.next;
	}

	public static void main(String[] args) {
		
	}
}
