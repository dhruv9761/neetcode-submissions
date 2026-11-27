class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        prev =  null;
        return inOrder(root);
    }
    boolean inOrder(TreeNode root){
        if(root==null) return true;
        //left Subtree not BST
        if(!inOrder(root.left)) return false;
        //check prev val if not null
        if(prev!=null && prev.val>=root.val) return false;
        //switch prev with root
        prev = root;
        //at last check right subtree BST or not
        return inOrder(root.right);
    }
}
