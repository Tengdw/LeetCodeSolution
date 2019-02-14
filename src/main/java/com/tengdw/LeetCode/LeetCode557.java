package com.tengdw.LeetCode;

import org.junit.Test;

/**
 * 反转字符串中的单词 III
 *
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/2/13 11:58
 */
public class LeetCode557 {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();
            String[] split = s.split(" ");
            for (String str : split) {
                for (int i = str.length(); i >= 1; i--) {
                    sb.append(str.charAt(i - 1));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }
    @Test
    public void test() {
        String s = new Solution().reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }
}
