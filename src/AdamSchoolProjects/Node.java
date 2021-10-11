package AdamSchoolProjects;

public class Node {

    private String _data;
    private Node _next;

    public Node() {
        this(null, null);
    }

    public Node(String data) {
        this(data, null);
    }

    public Node(Node nextNode) {
        this(null, nextNode);
    }

    public Node(String data, Node nextNode) {
        _data = data;
        _next = nextNode;
    }

    public String data() {
        return _data;
    }

    public Node next() {
        return _next;
    }
    
    
}
