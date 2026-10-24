
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            // Case 1: No child
            if(root.left == null && root.right == null){
                return null;
            }

            // Case 2: One child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // Case 3: Two children
            TreeNode IS = isR(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right, IS.val);
        }

        return root;
    }

    public TreeNode isR(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}
