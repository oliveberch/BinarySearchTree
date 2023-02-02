class RightBST {

    // Given Node node
    static class node {
        int key;
        node left, right;
    };

    // Function to create a new BST node
    static node newNode(int item) {
        node temp = new node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    // Function to print the right view
    // of a binary tree.
    static void rightViewUtil(node root, int level,
                              int max_level)
    {
        // Base Case
        if (root == null)
            return;
 
        // If this is the last Node of its level
        if (max_level < level) {
            System.out.print(" " + root.key);
            max_level = level;
        }
 
        // Recur for right subtree
 
        rightViewUtil(root.right, level + 1, max_level);
    }
 
    // Wrapper over rightViewUtil()
    static void rightView(node root)
    {
        int max_level = 0;
        rightViewUtil(root, 1, max_level);
    }
}