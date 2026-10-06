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
import java.util.*;
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        Set<Integer> set=new HashSet<>();
        return helper(root,set);
    }
    public boolean helper(TreeNode p,Set<Integer> set ){
        if(p==null) return true;
        set.add(p.val);
        if((set.size()!=0)&&(set.size()>1)) return false;
        boolean left=helper(p.left,set);
        boolean right=helper(p.right,set);
        return left&&right;
    }
}