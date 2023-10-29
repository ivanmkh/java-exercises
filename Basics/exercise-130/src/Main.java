import java.util.Objects;

// Write a Java program to find the maximum depth of a given binary tree.
// Sample Output: The Maximum depth of the binary tree is: 3
public class Main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(55);
        tree.left = new TreeNode(21);
        tree.right = new TreeNode(80);
        tree.left.left = new TreeNode(9);
        tree.left.right = new TreeNode(29);
        tree.right.left = new TreeNode(76);
        tree.right.right = new TreeNode(91);
        tree.right.right.left = new TreeNode(43);

        System.out.printf("The Maximum depth of the binary tree is: %d", getMaxTreeDepth(tree));
    }

    public static int getMaxTreeDepth(TreeNode root) {
        int rightDepth = 1;
        int leftDepth = 1;
        if (Objects.isNull(root)){
            return 0;
        }
        rightDepth += getMaxTreeDepth(root.right);
        leftDepth += getMaxTreeDepth(root.left);
        return rightDepth > leftDepth ? rightDepth : leftDepth;
    }
}