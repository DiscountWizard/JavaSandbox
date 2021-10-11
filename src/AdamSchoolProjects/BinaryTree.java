package AdamSchoolProjects;

public class BinaryTree {

    private BinaryNode _root;

    public BinaryTree() {
        this(null);
    }

    public BinaryTree(BinaryNode root) {
        _root = root;
    }

    public BinaryNode getRoot() {
        return _root;
    }

    public void setRoot(BinaryNode root) {
        this._root = root;
    }
    
}
