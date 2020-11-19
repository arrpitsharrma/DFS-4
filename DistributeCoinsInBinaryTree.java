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
 //TC: O(n)
 //SC: O(h)
class Solution {
    int moves;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    
    private int dfs(TreeNode root){
        //base
        if(root == null) return 0;
        
        //logic
        int spareCoins = root.val - 1;
        spareCoins += dfs(root.left);
        spareCoins += dfs(root.right);
        moves += Math.abs(spareCoins);
        return spareCoins;
    }
}
