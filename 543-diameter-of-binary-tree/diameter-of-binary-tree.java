class Solution {

    class Treeinfo {
        int height;
        int dia;

        Treeinfo(int height, int dia) {
            this.height = height;
            this.dia = dia;
        }
    }

    public Treeinfo hd(TreeNode root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }

        Treeinfo left = hd(root.left);
        Treeinfo right = hd(root.right);

        int myh = Math.max(left.height, right.height) + 1;

        int leftd = left.dia;
        int rightd = right.dia;

        int myd = left.height + right.height;

        int max = Math.max(myd, Math.max(leftd, rightd));

        return new Treeinfo(myh, max);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Treeinfo result = hd(root);
        return result.dia;
    }
}