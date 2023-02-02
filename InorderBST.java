class InorderBST {

	// Given Node node
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

	// Function to do inorder traversal of BST
	static void inorder(node root)
	{
		if (root != null) {
			inorder(root.left);
			System.out.print(" " + root.key);
			inorder(root.right);
		}
	}

}