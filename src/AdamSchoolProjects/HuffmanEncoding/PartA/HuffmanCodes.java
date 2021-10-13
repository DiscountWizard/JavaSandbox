package AdamSchoolProjects.HuffmanEncoding.PartA;

import java.io.File;
import java.io.FileReader;
import java.util.PriorityQueue;

public class HuffmanCodes {

    private class charFrequency implements Comparable<charFrequency> {
        private int freq;
        private char data;
        private BinaryTree<Character> bt;

        private charFrequency(int f, Character c) {
            freq = f;
            data = c;
            bt = new BinaryTree<Character>(data);
        }

        private charFrequency(int f, Character c, charFrequency leftchild, charFrequency rightChild) {
            freq = f;
            data = c;
            bt = new BinaryTree<Character>(leftchild.bt, data, rightChild.bt);
        }

        @Override
        public int compareTo(charFrequency x) {
            return freq - x.freq;
        }
    }

    String BASE_PATH = ".\\resources\\h4TestData\\";

    public HuffmanCodes(String in) throws Exception {
        int[] freqAry = new int[128];

        // Reads characters from file
        // increments count of each character using index of array as char code
        FileReader reader = new FileReader(new File(BASE_PATH + in));
        int currCharCode = reader.read();
        while (currCharCode != -1) {
            freqAry[currCharCode]++;
            currCharCode = reader.read();
        }

        // Add chars to PriorityQueue based on frequency of character in input file.
        PriorityQueue<charFrequency> charPriority = new PriorityQueue<>(128);
        for (int i = 0; i < freqAry.length; i++) {
            // Only add to queue if char appeared at least once in file.
            if (freqAry[i] > 0) {
                charPriority.add(new charFrequency(freqAry[i], (char) i));
            }
        }

        // Build Binary Tree
        // pull two lowest frequency chars from queue
        // build new char (with BinaryTree inside) with two chars as the children and frequency the sum of the chilldren's frequency.
        // add char back onto queue to let it sort according to frequency.
        // Loop until there is only one item in queue remaining.
        charFrequency temp1, temp2;
        while (charPriority.size() > 1) {
            temp1 = charPriority.poll();
            temp2 = charPriority.poll();
            charPriority.add(new charFrequency(temp1.freq + temp2.freq, ' ', temp1, temp2));
        }

        // Pull final BinaryTree from queue.
        BinaryTree<Character> btprint = charPriority.poll().bt;

        for (int i = 0; i < 128; i++) {
            System.out.println(i + " " + btprint.getPathTo((char) i));
        }
        
    }

    public static void main(String[] args) throws Exception {
        new HuffmanCodes(args[0]);
    }
    
}
