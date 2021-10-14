package AdamSchoolProjects.HuffmanEncoding.Project1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HuffmanEncode {

    String BASE_PATH = ".\\resources\\h4TestData\\";

    public HuffmanEncode(String in, String out) throws Exception {
        //Implements the main flow of your program
        //in is the name of the source file
        //out is the name of the output file
        //Add private methods and instance variables as needed
        FileReader reader = new FileReader(new File(BASE_PATH + in));
        FileWriter writer = new FileWriter(new File(BASE_PATH + out));

        
    }

    public static void main(String[] args) throws Exception {
        //args[0] is the name of the source file
        //args[1] is the name of the output file
        new HuffmanEncode(args[0], args[1]);
        //do not change anything here
    }
    
}
