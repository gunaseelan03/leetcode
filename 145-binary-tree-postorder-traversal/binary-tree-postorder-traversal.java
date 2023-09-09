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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        TreeNode cur = root;
        while(cur!=null){
            if(cur.right==null){
                list.add(cur.val);
                cur = cur.left;
            }
            else{
                TreeNode prev = cur.right;
                while(prev.left!=null && prev.left!=cur){
                    prev=prev.left;
                }
                if(prev.left==null){
                    list.add(cur.val);
                    prev.left=cur;
                    cur=cur.right;
                }
                else{
                    prev.left=null;
                    cur=cur.left;
                }
            }
        }
        Collections.reverse(list);
        return list;
    }
}