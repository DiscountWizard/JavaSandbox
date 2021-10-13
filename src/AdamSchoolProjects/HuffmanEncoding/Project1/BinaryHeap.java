package AdamSchoolProjects.HuffmanEncoding.Project1;

public class BinaryHeap {

    int priority[];
    HuffmanTree trees[];
    int size;

    public BinaryHeap(int s) {
        priority = new int[s + 1];
        trees = new HuffmanTree[s + 1];
        size = 0;
    }

    public void removeMin() {

    }

    public int getMinPriority() {
        return 0;
    }

    public HuffmanTree getMinTree() {
        return new HuffmanTree();
    }

    public boolean full() {
        return true;
    }

    public void insert(int p, HuffmanTree t) {

    }

    public int getSize() {
        return 0;
    }
    
}
