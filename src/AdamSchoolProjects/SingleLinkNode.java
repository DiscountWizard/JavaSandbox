package AdamSchoolProjects;

public class SingleLinkNode {

    private String _data;
    private SingleLinkNode _next;

    public SingleLinkNode() {
        this(null, null);
    }

    public SingleLinkNode(String data) {
        this(data, null);
    }

    public SingleLinkNode(SingleLinkNode nextNode) {
        this(null, nextNode);
    }

    public SingleLinkNode(String data, SingleLinkNode nextNode) {
        _data = data;
        _next = nextNode;
    }

    public String data() {
        return _data;
    }

    public SingleLinkNode next() {
        return _next;
    }
    
    
}
