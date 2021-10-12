package AdamSchoolProjects.HuffmanEncoding.PartA;

import java.util.PriorityQueue;
import java.util.Random;

public class PQExample {

    private class Item implements Comparable<Item> {
        private int pri;
        private Object data;

        private Item(int p, Object d) {
            pri = p;
            data = d;
        }

        @Override
        public int compareTo(Item x) {
            return pri - x.pri;
        }
    }

    public PQExample() {
        PriorityQueue<Item> x = new PriorityQueue<>(20);
        Random r = new Random();
        
        for (int i = 10; i > 0; i--) {
            x.add(new Item(r.nextInt()%1000, Integer.valueOf(i).toString()));
        }

        while (x.size() > 0) {
            Item y = x.poll();
            System.out.println(y.pri + " " + y.data);
        }

    }

    public static void main(String[] args) {
        new PQExample();
    }
    
}
