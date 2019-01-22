package com.tengdw.LeetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * 除自身以外数组的乘积
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/1/22 17:05
 */
public class LeetCode238 {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            //保存0 ~ i之间所有数的乘积（当前元素左边所有数的乘积）
            int[] ans = new int[nums.length];
            Arrays.fill(ans, 1);
            int n = 1;
            for (int i = 0; i < nums.length; i++) {
                ans[i] = n;
                n *= nums[i];
            }
            //第二次循环n为i ~ nums.length - 1之间所有数的乘积（当前元素右边所有数的乘积）
            n = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                ans[i] *= n;
                n *= nums[i];
            }
            return ans;
        }
    }

    @Test
    public void test() {
        /*
        1,2,3,4 24,12,8,6
        2,3,4,5 60,40,30,24
         */
        int[] nums = {2,3,4,5};
        int[] ans = new Solution().productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}
