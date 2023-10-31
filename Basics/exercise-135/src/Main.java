import java.util.Objects;

// Write a Java program to remove duplicates from a sorted linked list.
// Original List with duplicate elements:
// 12->12->13->14->15->15->16->17->17
// After removing duplicates from the given list:
// 12->13->14->15->16->17
public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.add(12);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(17);

        Node current = list.root;
        while (!Objects.isNull(current.next)) {
            current = current.next;
            if (current.data == current.next.data) {
                list.delete(current.next);
            }
        }

        System.out.println("After removing duplicates from the given list:");
        current = list.root;
        while (!Objects.isNull(current.next)) {
            current = current.next;
            String link = current.next != null ? " -> " : "";
            System.out.printf("%d%s", current.data, link);
        }
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList {
    public Node root;
    public Node last;

    public SortedLinkedList() {
        this.root = new Node(0);
        this.last = root;
    }

    public void add(int value) {
        this.last.next = new Node(value);
        this.last = this.last.next;
    }

    public void delete(Node node) {
        Node current = this.root;
        while (current.next != node) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}