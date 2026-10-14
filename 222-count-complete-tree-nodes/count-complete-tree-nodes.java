/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int leftsum(TreeNode root){
        int c = 0;
        while(root != null){
            c++;
            root = root.left;
        }
        return c;
    }

    public int rightsum(TreeNode root){
        int c = 0;
        while(root != null){
            c++;
            root = root.right;
        }
        return c;
    }

    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ls = leftsum(root);
        int rs = rightsum(root);
        if(ls == rs){
            return (int)Math.pow(2,rs)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}