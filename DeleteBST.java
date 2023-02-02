// Java program to implement optimized delete in BST.
public class DeleteBST {

    static class Node {
        int key;
        Node left, right;
    }

    // A utility function to create a new BST node
    static Node newNode(int item) {
        Node temp = new Node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    static Node deleteNode(Node root, int k) {

        // Base case
        if (root == null)
            return root;

        // Recursive calls for ancestors of
        // node to be deleted
        if (root.key > k) {
            root.left = deleteNode(root.left, k);
            return root;
        } else if (root.key < k) {
            root.right = deleteNode(root.right, k);
            return root;
        }

        // We reach here when root is the node
        // to be deleted.
        // If one of the children is empty
        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        }

        // If both children exist
        else {
            Node succParent = root;

            // Find successor
            Node succ = root.right;

            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            // Delete successor. Since successor
            // is always left child of its parent
            // we can safely make successor's right
            // right child as left of its parent.
            // If there is no succ, then assign
            // succ->right to succParent->right
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;

            // Copy Successor Data to root
            root.key = succ.key;

            return root;
        }
    }

}
