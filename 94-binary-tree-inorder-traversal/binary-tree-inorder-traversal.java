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
    public void inorder(TreeNode node,List<Integer>lst){
        if(node==null)
            return;
        inorder(node.left,lst);
        lst.add(node.val);
        inorder(node.right,lst);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
}