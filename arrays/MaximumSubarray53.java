package com.like.arrays;

/**
 * @Description
 * @Author
 */
public class MaximumSubarray53 {
    public int maxSubArray1(int[] nums) {
        //滑动窗口   可行，但是O(N^2)时间复杂度太大，需要缩减到O(N)
        if(nums.length == 1){
            return nums[0];
        }
        int max = nums[0]; //不能随便赋值为0， 要考虑数组元素可能为负
        for(int i = 1; i <= nums.length;i++){
            int sum = 0;
            for(int j = 0; j < nums.length; j++){
                if(j < i){
                    sum = sum + nums[j];
                }else{
                    sum = sum + nums[j] - nums[j - i] ;
                }
                max = sum > max ? sum : max;
            }
        }
        return max;
    }
    //递归法
    public int maxSubArray2(int[] nums) {

        return findMax(nums, 0, nums.length - 1);
    }
    public static int findMax(int[] nums, int low, int high){
        if(high < low){
            return nums[low];
        }
        int mid = low + (high - low) /2;
        int num1 = findMax(nums, low, mid - 1);
        int num2 = findMax(nums, mid + 1, high);
        int max = num1 > num2 ? num1 : num2;
        return max;
    }
}
