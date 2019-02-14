package com.tengdw.LeetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * 反转字符串
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/2/13 15:03
 */
public class LeetCode344 {
    class Solution {
        public void reverseString(char[] s) {
            int l = 0, r = s.length - 1;
            while (l < r) {
                char temp = s[l];
                s[l++] = s[r];
                s[r--] = temp;
            }
        }
    }

    @Test
    public void test() {
        char[] s = new char[]{'H','e','l','l','o'};
        new Solution().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
