package com.tengdw.LeetCode;

/**
 * 最长特殊序列 Ⅰ （垃圾题）
 * @author: Tengdw t_dw@qq.com
 * @create: 2019-02-24 11:53
 **/
public class LeetCode521 {
    class Solution {
        public int findLUSlength(String a, String b) {
            if (a.equals(b))
                return -1;
            return Math.max(a.length(), b.length());
        }
    }
}
