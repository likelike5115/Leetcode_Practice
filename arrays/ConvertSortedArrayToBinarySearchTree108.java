package com.like.arrays;

/**
 * @Description
 * @Author
 */
public class ConvertSortedArrayToBinarySearchTree108 {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        int headIndex = nums.length / 2;
//        TreeNode head = new TreeNode(nums[headIndex]);
//        int left = headIndex - 1;
//        int right = headIndex + 1;
//        TreeNode parentNodeLeft = head;
//        TreeNode parentNodeRight = head;
//        while(left >= 0 && right <= nums.length - 1){
//            TreeNode leftNode = new TreeNode(nums[left]);
//            TreeNode rightNode = new TreeNode(nums[right]);
//            insertNode(parentNodeLeft, leftNode);
//            insertNode(parentNodeRight, rightNode);
//            parentNodeLeft = leftNode;
//            parentNodeRight = rightNode;
//            left--;
//            right++;
//        }
//
//        return head;
//    }
//    public static void insertNode(TreeNode parent, TreeNode node){
//        if(node.val < parent.val){
//            parent.left = node;
//        }else{
//            parent.right = node;
//        }
//    }
//    public TreeNode sortedArrayToBST(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//        int headIndex = (nums.length - 1) / 2;
//        TreeNode leftHead;
//        TreeNode rightHead;
//        TreeNode leftNode = new TreeNode(nums[left]);
//        TreeNode rightNode = new TreeNode(nums[right]);
//        leftHead = leftNode;
//        rightHead = rightNode;
//        while(left < headIndex && right > headIndex){
//            leftNode = new TreeNode(nums[left]);
//            rightNode = new TreeNode(nums[right]);
//            leftHead = buildTree(leftHead,leftNode);
//            rightHead = buildTree(rightHead,rightNode);
//            left++;
//            right--;
//        }
//        TreeNode head = new TreeNode(nums[headIndex]);
//        head.left = leftHead;
//        head.right = rightHead;
//        return head;
//    }
//    public static TreeNode buildTree(TreeNode head, TreeNode node){
//        TreeNode cur = head;
//        TreeNode curParent = null;
//        while(cur != null){
//            curParent = cur;
//            if(cur.val < node.val){
//                cur = cur.right;
//            }else{
//                cur = cur.left;
//            }
//        }
//        if(curParent.val < node.val){
//            curParent.right=node;
//        }else{
//            curParent.left = node;
//        }
//        return head;
//    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }
    public static TreeNode buildTree(int[] nums, int low, int high){
        if(high < low){
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, low, mid -1);
        root.right = buildTree(nums, mid + 1, high);
        return root;
    }
}
