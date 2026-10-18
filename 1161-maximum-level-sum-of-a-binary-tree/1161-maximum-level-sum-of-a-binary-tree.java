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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=0,sum=Integer.MIN_VALUE,currlevel=1;
        while(!q.isEmpty()){
            int size=q.size();
            int currsum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                currsum+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            if(currsum>sum){
                sum=currsum;
                level=currlevel;
            }
            currlevel++;
        }
        return level;
    }
}