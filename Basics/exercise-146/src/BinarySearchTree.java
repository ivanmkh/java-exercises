public class BinarySearchTree {
    public TreeNode root;

    public BinarySearchTree() {
    }

    public static TreeNode sortedArrayToBST(int[] array) {
        return convert(array, 0, array.length - 1);
    }

    private static TreeNode convert(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int middleIndex = (start + end) / 2;
        TreeNode node = new TreeNode(array[middleIndex]);
        node.left = convert(array, start, middleIndex - 1);
        node.right = convert(array, middleIndex + 1, end);
        return node;
    }


    private String postOrderTraversal(TreeNode root) {
        if (root == null) {
            return "";
        }
        String result = "";
        result += postOrderTraversal(root.left);
        result += postOrderTraversal(root.right);
        result += root.key + " ";
        return result;
    }

    @Override
    public String toString() {
        return postOrderTraversal(root);
    }
}
