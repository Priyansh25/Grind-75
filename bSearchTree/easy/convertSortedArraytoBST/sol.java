package bSearchTree.easy.convertSortedArraytoBST;

//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {

    public TreeNode util(int[] nums, int low, int high){

        if(low < 0 || high > nums.length-1 || low > high)return null;

        int mid=low+(high-low)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left=util(nums,low,mid-1);
        root.right=util(nums,mid+1,high);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        return util(nums,0,nums.length-1);

    }
}