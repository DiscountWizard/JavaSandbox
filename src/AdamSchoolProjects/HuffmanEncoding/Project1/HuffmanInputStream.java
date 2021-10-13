package AdamSchoolProjects.HuffmanEncoding.Project1;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class HuffmanInputStream {

    private String tree;
    private int totalChars;
    private DataInputStream d;

    public HuffmanInputStream(String filename) {
        try {
            d = new DataInputStream(new FileInputStream(filename));
            tree = d.readUTF();
            totalChars = d.readInt();
        } catch (Exception e) { }
    }

    public int readBit() {
        try {

        } catch (Exception e) { }

        return 0;
    }

    public String getTree() {
        return tree;
    }

    public int getTotalChars() {
        return totalChars;
    }

    public void close() throws Exception {
        d.close();
    }

}
