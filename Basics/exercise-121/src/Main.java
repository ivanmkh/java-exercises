// Write a Java program to reverse a linked list.
//Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
public class Main {
    public static void main(String[] args) {
        LinkedNodesList list = new LinkedNodesList();
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }
}