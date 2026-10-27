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


import java.util.ArrayList;

class Solution {

    public ArrayList<Integer> sorted(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }

        sorted(root.left, list);
        list.add(root.val);
        sorted(root.right, list);

        return list;
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list = sorted(root, list);

        return list.get(k - 1);
    }
}
