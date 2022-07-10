public class Solution9 {

    /*
    *
    * Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.*/

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSubtreeDiameter = diameterOfBinaryTree(root.left);
        int rightSubtreeDiameter = diameterOfBinaryTree(root.right);
        int diameter = getDepth(root.left) + getDepth(root.right);
        diameter = Math.max(diameter, Math.max(leftSubtreeDiameter, rightSubtreeDiameter));
        return diameter;
    }


    int getDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSubtreeDepth = getDepth(root.left);
        int rightSubtreeDepth = getDepth(root.right);
        return Math.max(leftSubtreeDepth, rightSubtreeDepth) + 1;
    }


}
