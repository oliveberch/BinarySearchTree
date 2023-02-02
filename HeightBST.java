class HeightBST {

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

    // Returns height of the BST
    static int height(node node) {
        if (node == null)
            return 0;
        else {

            // Compute the depth of each subtree
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            // Use the larger one
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}