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
    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrder(root, values);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) <= values.get(i - 1)) {
                return false; 
            }
        }  
        return true;
    }    
    private void inOrder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inOrder(node.left, values);  
        values.add(node.val);        
        inOrder(node.right, values);  
    }
}
