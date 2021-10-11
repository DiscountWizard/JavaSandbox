package AdamSchoolProjects;

public class BinaryNode {
    
    private String _data;
    private BinaryNode _left, _right;

    public BinaryNode() {
        this(null, null, null);
    }

    public BinaryNode(String data) {
        this(data, null, null);
    }

    public BinaryNode(String data, BinaryNode leftChild, BinaryNode rightChild) {
        _data = data;
        _left = leftChild;
        _right = rightChild;
    }

    public String data() {
        return _data;
    }

    public BinaryNode left() {
        return _left;
    }

    public BinaryNode right() {
        return _right;
    }

}
