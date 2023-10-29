import com.sun.source.tree.Tree;

import java.util.Objects;

//  Write a Java program to get the in-order traversal of its nodes' values in a binary tree.
public class Main {
    public static void main(String[] args) {
        TreeNode tree = initTree();
        InOrderTraversal(tree);
    }

    private static TreeNode initTree() {
        TreeNode tree = new TreeNode(10);
        tree.left = new TreeNode(20);
        tree.right = new TreeNode(30);
        tree.left.left = new TreeNode(40);
        tree.left.right = new TreeNode(50);

        return tree;
    }

    public static void InOrderTraversal(TreeNode node) {
        if (Objects.isNull(node)) {
            return;
        }
        InOrderTraversal(node.left);
        System.out.printf("%d ", node.data);
        InOrderTraversal(node.right);
    }
}