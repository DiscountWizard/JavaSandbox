package AdamSchoolProjects.HuffmanEncoding.PartA;

public class BinaryTree<T> {

    private class Node {
        private Node _left, _right;
        private T _data;

        private Node(Node l, T d, Node r) {
            _left = l;
            _data = d;
            _right = r;
        }
    }

    private Node _root;

    public BinaryTree() {
        _root = null;
    }

    public BinaryTree(T data) {
        _root = new Node(null, data, null);
    }

    public BinaryTree(BinaryTree<T> b1, T data, BinaryTree<T> b2) {
        _root = new Node(b1._root, data, b2._root);
    }

    public Node getRoot() {
        return _root;
    }

    public void setRoot(Node root) {
        this._root = root;
    }

    public String getPathTo(T leafData) {
        return getPathTo(leafData, _root);
    }

    public String getPathTo(T leafData, Node r) {
        if (r == null) {
            return "";
        }

        if (r._data == leafData) {
            return " ";
        }

        String leftPath = getPathTo(leafData, r._left);
        if (!leftPath.equals("")) {
            return "0" + leftPath;
        }

        String rightPath = getPathTo(leafData, r._right);
        if (!rightPath.equals("")) {
            return "1" + rightPath;
        }

        return "";
    }

    @Override
    public String toString() {
        return _root.toString();
    }
    
}

