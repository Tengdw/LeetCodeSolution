package com.tengdw.LeetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 数组中重复的数据
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/1/22 15:38
 */
public class LeetCode442 {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            int[] temp = new int[nums.length + 1];
            for (int num : nums)
                if (temp[num] == 0) temp[num]++;
                else ans.add(num);
            return ans;
        }
    }

    //每出现一个数字将其对应位置置为其负数, 下次遇到一个数字判断对应位置是否为负数即可
    class Solution1 {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;
                if (nums[index] > 0) {
                    nums[index] = -nums[index];
                } else {
                    ans.add(index + 1);
                }
            }
            return ans;
        }
    }

    @Test
    public void test() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new Solution1().findDuplicates(nums);
        System.out.println(ans);
    }
}
