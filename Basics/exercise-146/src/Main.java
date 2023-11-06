// Write a Java program to convert an array of sorted items into a binary search tree.
// Maintain the minimal height of the tree.
// Sample Output: 2 1 4 6 5 3
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = BinarySearchTree.sortedArrayToBST(array);
        System.out.println(tree);
    }
}