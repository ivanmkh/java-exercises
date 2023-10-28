import com.sun.source.tree.Tree;

import java.util.Objects;

// Write a Java program to get the preorder traversal of the values of the nodes in a binary tree.
//  Example:
//      10
//     / \
//    20   30
//   / \
//  40  50
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        preorderTraversal(root);
    }

    public static void preorderTraversal(TreeNode root) {
        if (Objects.isNull(root)) {
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}