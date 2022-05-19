package com.like.arrays;

/**
 * @Description 前后两个指针向中心移动   做得太复杂了，有更好的解法
 * @Author
 */
public class RemoveElement27 {
public int removeElement(int[] nums, int val) {
    int pre = 0;
    int post = nums.length - 1;
    while(post >= pre){
        if(nums[post] == val){ //情况一：后指针值为val,移动后指针
            post--;
            continue;
        }
        if(nums[pre] == val){ //情况二：前指针值为val，拷贝后指针的值到前指针，移动后指针
            nums[pre] = nums[post];
            post--;
            continue;
        }
        if(pre < post){ //前指针的值没有问题且前指针没到达后指针，移动前指针
            pre++;
        }else{
            break;
        }
    }
    return post >= 0 ? pre + 1 : 0; //前指针是索引值，所以最后求长度+1,这里的判断是防止[1,1,1,1]的情况
    //此时只移动后指针，最后后指针的值会小于0
}
}
