package com.tengdw.LeetCode;

import org.junit.Test;

/**
 * 提莫攻击
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/1/22 17:53
 */
public class LeetCode495 {
    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            int count = 0;
            int dur = 0;
            for (int i = 0; i < timeSeries.length; i++) {
                if (i == 0){
                    count += duration;
                    dur = duration;
                    continue;
                }
                // 攻击的时间间隔小于中毒时间，只要加上攻击间隔时间就可以了
                if (dur > timeSeries[i] - timeSeries[i - 1]) {
                    dur = duration;
                    count += timeSeries[i] - timeSeries[i - 1];
                } else {
                    count += duration;
                }
            }
            return count;
        }
    }

    @Test
    public void test() {
        /*
        1,4 2 4
        1,2 2 3
        1,2,3,4,5 5 9
         */
        int[] timeSeries = {1,2};
        int duration = 2;
        int ans = new Solution().findPoisonedDuration(timeSeries, duration);
        System.out.println(ans);
    }
}
