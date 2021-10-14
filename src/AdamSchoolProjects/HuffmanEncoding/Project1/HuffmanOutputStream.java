package AdamSchoolProjects.HuffmanEncoding.Project1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class HuffmanOutputStream {

    private DataOutputStream d;

    public HuffmanOutputStream(String filename, String tree, int totalChars) {
        try {
            d = new DataOutputStream(new FileOutputStream(filename));
            d.writeUTF(tree);
            d.writeInt(totalChars);
        } catch (Exception e) { }
    }

    public void writeBit(char bit) {
        //PRE:bit == '0' || bit == '1'
        try {

        } catch (Exception e) { }
    }

    public void close() {
        //write final byte (if needed)
        //close the DataOutputStream
        try {

        } catch (Exception e) { }
    }
    
}
