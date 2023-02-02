class InsertBST{

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

	// Function to insert a new node with
	// given key in BST
	static node insert(node node, int key)
	{
		// If the tree is empty, return a new node
		if (node == null)
			return newNode(key);

		// Otherwise, recur down the tree
		if (key < node.key) {
			node.left = insert(node.left, key);
		}
		else if (key > node.key) {
			node.right = insert(node.right, key);
		}
		// Return the node
		return node;
	}
}