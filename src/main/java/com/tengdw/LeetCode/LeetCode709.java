package com.tengdw.LeetCode;

import org.junit.Test;

/**
 * 转换成小写字母
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/2/13 11:33
 */
public class LeetCode709 {
    class Solution {
        public String toLowerCase(String str) {
            char[] charArray = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                int i = c;
                if (i >= 65 && i <= 90) {
                    i = 97 + (i - 65);
                    sb.append((char) i);
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

    @Test
    public void test() {
        String s = new Solution().toLowerCase("HelloWOrld41654");
        System.out.println(s);
    }
}
