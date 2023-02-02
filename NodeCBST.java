public class NodeCBST {
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

    // Function to get the total count of
    // nodes in a binary tree
    static int nodeCount(node node) {
        if (node == null)
            return 0;

        else
            return nodeCount(node.left) + nodeCount(node.right) + 1;
    }
}
