package AdamSchoolProjects.HuffmanEncoding.Project1;

public class HuffmanTree {

    //DO NOT include the frequency or priority in the tree

    private class Node {
        private Node _left, _right;
        private char _data;

        private Node(Node l, char d, Node r) {
            _left = l;
            _data = d;
            _right = r;
        }
    }

    private Node root;
    private Node current; //this value is changed by the move methods

    public HuffmanTree() {
        root = null;
        current = null;
    }

    public HuffmanTree(char d) {
        //makes a single node tree
        root = new Node(null, d, null);
    }

    public HuffmanTree(String t, char nonLeaf) {
        //Assumes t represents a post order representation of the tree as discussed
        // in class
        //nonLeaf is the char value of the data in the non-leaf nodes
        //in the following I will use (char) 128 for the non-leaf value

    }

    public HuffmanTree(HuffmanTree b1, char d, HuffmanTree b2) {
        //makes a new tree where b1 is the left subtree and b2 is the right subtree
        //d is the data in the root
        root = new Node(b1.root, d, b2.root);
    }

    //the move methods to traverse the tree
    //the move methods change the value of current
    //use these in the decoding process

    public void moveToRoot() {
        //change current to reference the root of the tree
        current = root;
    }

    public void moveToLeft() {
        //PRE: the current node is not a leaf
        //change current to reference the left child of the current node
        if (current._left != null) {
            current = current._left;
        }
    }

    public void moveToRight() {
        //PRE: the current node is not a leaf
        //change current to reference the right child of the current node
        if (current._right != null) {
            current = current._right;
        }
    }

    public boolean atRoot() {
        //returns true if the current node is the root otherwise returns false
        return current == root;
    }

    public boolean atLeaf() {
        //returns true if current references a leaf other wise returns false
        if (current._left == null && current._right == null) {
            return true;
        } else {
            return false;
        }
    }

    public char current() {
        //returns the data value in the node referenced by current
        return current._data;
    }

    public String[] pathsToLeaves() {
        /*returns an array of 128 strings (some of which could be null) with all paths from the root to the leaves
        Each string will be a string of 0s and 1s. Store the path for a particular leaf in the array
        at the location of the leaf value’s character code
        */
        String[] output = new String[128];

        return output;
    }

    public String toString() {
        //returns a string representation of the tree using the postorder format
        // discussed in class
        return "";
    }
    
}
