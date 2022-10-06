package src;

public class SinglyLL {

    Node head;
    Node tail;
    int l;

    public SinglyLL() {
        l = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // Insert At First Index
    void insertFirst(int v) {
        Node node = new Node(v);
        node.next = head;
        head = node;

        if (tail == null)
            tail = head;
        l++;
    }

    // Insert Last
    void intsertLast(int v) {
        if (tail == null) {
            insertFirst(v);
            return;
        }
        Node node = new Node(v);
        tail.next = node;
        tail = node;
        l++;
    }

    // Insert At Any
    void insert(int v, int i) {
        if (i == 0) {
            insertFirst(v);
            return;
        }
        if (i == l) {
            intsertLast(v);
            return;
        }
        Node t = head;
        for (int j = 1; j < i; j++) {
            t = t.next;
        }
        Node node = new Node(v, t.next);
        t.next = node;
        l++;
    }

    // Delete First
    int deleteF() {
        int v = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        l--;
        return v;
    }

    // Display
    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
    }

}
