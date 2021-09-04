package binaryTree;

public class BinaryTree {

	private static Node root;

	public static Node insertNode(Node newNode, Node parent) {
		
		if (root == null) {
			root = newNode;
		}
		else {
			if (parent == null) {
				parent = newNode;
				return parent;
			}
			if (newNode.getValue() < parent.getValue()) {
				parent.setLeft(insertNode(newNode, parent.getLeft()));
			}
			if (newNode.getValue() > parent.getValue())	{
				parent.setRight(insertNode(newNode, parent.getRight()));
			}
		}
		return parent;
	}

	public static Node findNode(int value, Node reference) {
		if (reference == null) {
			return null;
		}
		else {
			if (reference.getValue() == value) 	return reference;
			else {
				if (value < reference.getValue()) return findNode(value, reference.getLeft());
				if (value > reference.getValue()) return findNode(value, reference.getRight());
				else return null;
			}
		}
	}
	
	public static void traverseTree(Node parent) {
		
		if (parent != null) {
			traverseTree(parent.getLeft());
			System.out.println(parent.getValue());
			traverseTree(parent.getRight());
		}
		
	}

	public static void main(String[] args) {

		int[] data = { 3, 4, 2, 5, 6, 7, 8, 1 };

		for (int i : data) {
			Node n = new Node(i);
			insertNode(n, root);
		}

		//System.out.println(findNode(5, root).getValue());
		
		traverseTree(root);
	}

}
