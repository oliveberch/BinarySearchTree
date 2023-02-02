class PostorderBST {

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

    // Function to do postorder traversal of BST
    static void postOrder(node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.key);
        }
    }
}