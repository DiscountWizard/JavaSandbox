package AdamSchoolProjects.HuffmanEncoding.Project1;

public class HuffmanTree {

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
    private Node current;

    public HuffmanTree() {
        root = null;
        current = null;
    }

    public HuffmanTree(char d) {
        root = new Node(null, d, null);
    }

    public HuffmanTree(String t, char nonLeaf) {

    }

    public HuffmanTree(HuffmanTree b1, char d, HuffmanTree b2) {
        root = new Node(b1.root, d, b2.root);
    }

    public void moveToRoot() {
        current = root;
    }

    public void moveToLeft() {
        if (current._left != null) {
            current = current._left;
        }
    }

    public void moveToRight() {
        if (current._right != null) {
            current = current._right;
        }
    }

    public boolean atRoot() {
        return current == root;
    }

    public boolean atLeaf() {
        if (current._left == null && current._right == null) {
            return true;
        } else {
            return false;
        }
    }

    public char current() {
        return current._data;
    }

    public String[] pathsToLeaves() {
        String[] output = new String[128];

        return output;
    }

    public String toString() {
        return "";
    }
    
}
