package AdamSchoolProjects.ProgrammingQuiz4;

import java.util.Iterator;
import java.util.Scanner;

public class BinaryTree {

    private class InOrderIterator implements Iterator<String> {

        Node currNode, prevNode, finalNode;

        public InOrderIterator() {
            prevNode = null;
            currNode = null;

            finalNode = root;
            while (finalNode.right != null) {
                finalNode = finalNode.right;
            }
        }

        private void farthestLeft() {
            while (currNode.left != null) {
                currNode = currNode.left;
            }
        }

        @Override
        public boolean hasNext() {
            return finalNode != currNode;
        }
    
        @Override
        public String next() {

            if (currNode == null) {
                currNode = root;
                farthestLeft();
            } else if (currNode.right != null) {
                currNode = currNode.right;
                farthestLeft();
            } else {
                do {
                    prevNode = currNode;
                    currNode = currNode.parent;
                } while (currNode.right == prevNode);
            }

            return currNode.data;
        }
    }

    private class Node {
        private Node left, right, parent;
        private String data;

        private Node(Node l, String d, Node r, Node p) {
            left = l;
            data = d;
            right = r;
            parent = p;
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(String d) {
        root = new Node(null, d, null, null);
    }

    public BinaryTree(String t, String open, String close, String empty) {
        Scanner s = new Scanner(t);
        root = buildTree(s, open, close, empty).root;
    }
    
    private BinaryTree buildTree(Scanner s, String open, String close, String empty) {
        String nxt = s.next();

        if (nxt.equals(empty)) {
            return new BinaryTree();
        }

        BinaryTree b1 = buildTree(s, open, close, empty);
        
        String d = s.next();
        BinaryTree b2 = buildTree(s, open, close, empty);
        s.next();

        return new BinaryTree(b1, d, b2);
    }

    public BinaryTree(BinaryTree b1, String d, BinaryTree b2) {
        root = new Node(b1.root, d, b2.root, null);
        if (b1.root != null) {
            b1.root.parent = root;
        }

        if (b2.root != null) {
            b2.root.parent = root;
        }
    }

    public Iterator<String> inOrder() {
        return new InOrderIterator();
    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree(args[0], "(", ")", "!");
        Iterator<String> itr = b.inOrder();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
    }

}
