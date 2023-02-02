//Base declaration of BinarySearchTree
public class BST {
	// Given Node
	static class node {
		int key;
		node left, right;
	};

	// Function to create a new BST node
	static node newNode(int item)
	{
		node temp = new node();
		temp.key = item;
		temp.left = temp.right = null;
		return temp;
	}
}