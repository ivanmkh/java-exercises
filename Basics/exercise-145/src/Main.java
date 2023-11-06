// Write a Java program to remove the nth element from the end of a given list.
// Sample Output:
// Original node:
// 1 2 3 4 5
// After removing 2nd element from end:
// 1 2 3 5
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.removeFromLast(2);
        System.out.println(list);
    }
}

class LinkedList {
    public Node root;
    public Node last;
    public int size;

    public LinkedList() {
        this.root = new Node();
        this.last = this.root;
        size = 0;
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        last.next = node;
        last = node;
        size++;
    }

    public void removeFromLast(int n) {
        if (n < 0 || size < n) {
            System.out.println("ERROR : n is out of range!");
            return;
        }
        int index = size - n;
        Node current = root;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.next.next != null) {
            current.next = current.next.next;
        } else {
            current.next = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = root;
        while (current.next != null) {
            current = current.next;
            sb.append(current.value + " ");
        }
        return sb.toString();
    }
}

class Node {
    int value;
    Node next;
}