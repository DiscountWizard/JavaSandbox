package AdamSchoolProjects.HuffmanEncoding.Project1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HuffmanEncode {

    String BASE_PATH = ".\\resources\\h4TestData\\";

    public HuffmanEncode(String in, String out) throws Exception {
        FileReader reader = new FileReader(new File(BASE_PATH + in));
        FileWriter writer = new FileWriter(new File(BASE_PATH + out));

        
    }

    public static void main(String[] args) throws Exception {
        new HuffmanEncode(args[0], args[1]);
    }
    
}
