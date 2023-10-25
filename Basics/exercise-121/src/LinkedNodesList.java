import java.util.Objects;

public class LinkedNodesList {
    public Node head;
    public Node last;

    public LinkedNodesList() {
        this.head = new Node();
        this.last = this.head;
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.next = null;
        newNode.value = value;
        last.next = newNode;
        last = last.next;
    }

    public void reverse() {
        Node current = this.head.next;
        Node previous = null;
        while (!Objects.isNull(this.head.next)) {
            current = this.head.next;
            this.head.next = current.next;
            current.next = previous;
            previous = current;
        }
        head.next = previous;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (!Objects.isNull(current.next)) {
            current = current.next;
            result.append(current.value + " ");
        }
        return result.toString();
    }
}
