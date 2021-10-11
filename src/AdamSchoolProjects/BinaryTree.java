package AdamSchoolProjects;

public class BinaryTree {

    private Node _root, _leftChild, _rightChild;

    public BinaryTree() {
        this(null, null, null);
    }

    public BinaryTree(Node root) {
        this(root, null, null);
    }

    public BinaryTree(Node root, Node leftChild, Node rightChild) {
        _root = root;
        _leftChild = leftChild;
        _rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "BinaryTree [_leftChild=" + _leftChild + ", _rightChild=" + _rightChild + ", _root=" + _root + "]";
    }
    
}
