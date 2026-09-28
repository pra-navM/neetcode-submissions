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

public int diam = 0; 

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(res,root);
        return res[0];
    }

    public int dfs(int[] res, TreeNode root){
        if(root==null) return 0;
        int left = dfs(res, root.left);
        int right = dfs(res, root.right);
        res[0] = Math.max(res[0], left+right);
        return 1 + Math.max(left,right);
    }
}
