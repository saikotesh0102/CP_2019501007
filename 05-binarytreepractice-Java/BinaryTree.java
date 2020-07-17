class Node {
	public int value;
	public Node left, right;
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	public Node root;
	
	public BinaryTree(int value) {
		// Your code goes here
		this.root = new Node(value);
	}

	public boolean search(int value) {
		// Your code goes here
		return search_Node(root, value);
	}

	private boolean search_Node(Node node, int value) {
		// Your code goes here
		while(node != null){
			if(value < node.value){
				node = node.left;
			}else if(value > node.value){
				node = node.right;
			}else{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}
}