// # Write the function hasBalancedParentheses, which takes a string and returns True 
// # if that code has balanced parentheses and False otherwise (ignoring all 
// # 	non-parentheses in the string). We say that parentheses are balanced if each 
// # right parenthesis closes (matches) an open (unmatched) left parenthesis, 
// # and no left parentheses are left unclosed (unmatched) at the end of the text. 
// # So, for example, "( ( ( ) ( ) ) ( ) )" is balanced, but "( ) )" is not balanced, and "( ) ) (" 
// # is also not balanced. Hint: keep track of how many right parentheses remain unmatched as 
// # you iterate over the string.

import java.util.*;
 
public class hasbalancedparantheses {
	StackNode head = null;
	int size = 0;

	public boolean fun_hasbalancedparantheses(String str){
		hasbalancedparantheses sol = new hasbalancedparantheses();
		String[] temp = str.split("");
		for (int i = 0; i < temp.length; i++) {
			sol.push(temp[i]);
		}

		if (sol.size == 0) {
			return true;
		} 
		return false;
	}

	public void push(final String data) {
		if (size == 0) {
			StackNode firstNode = new StackNode(data);
			head = firstNode;
			size++;
			return;
		}

		if (data.equals(")")) {
			if(head.data.equals("(")) {
				size--;
				head = head.next;
				return;
			}
		}

		if (data.equals("]")) {
			if(head.data.equals("[")) {
				head = head.next;
				size--;
				return;
			}
		}

		if (data.equals("}")) {
			if(head.data.equals("{")) {
				head = head.next;
				size--;
				return;
			}
		}	
		size++;
        StackNode firstNode = new StackNode(data);
        firstNode.next = head;
        head = firstNode;
	}

	public static void main(String[] args) {
		
	}
}

class StackNode {

    public String data;
    StackNode next;

    public StackNode(final String data) {
        this.data = data;
        this.next = null;
    }
}
	