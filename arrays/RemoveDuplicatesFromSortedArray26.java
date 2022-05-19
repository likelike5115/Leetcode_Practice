package com.like.arrays;

/**
 * @Description  使用快慢指针的方法  更好的解法不用两个循环，fast变化时slow走一步即可
 * @Author
 */
public class RemoveDuplicatesFromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1)
        {
            return 1;
        }
        int fast = 1;
        int slow = 1;
        while(fast < nums.length){
            while(nums[fast] == nums[fast - 1] && fast < nums.length - 1){
                fast++;
            }
            //[1,1,1,1] 这种情况 fast = 3时不进行nums[slow]更改
            if(nums[fast] == nums[fast - 1]){
                fast++;
            }
            //[1,1,1,2] 这种情况
            if(fast < nums.length){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }

        }
        return slow;
    }
}
