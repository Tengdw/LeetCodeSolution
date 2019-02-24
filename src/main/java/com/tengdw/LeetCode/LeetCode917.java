package com.tengdw.LeetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * 仅仅反转字母
 * @author: Tengdw t_dw@qq.com
 * @create: 2019-02-24 11:57
 **/
public class LeetCode917 {
    class Solution {
        public String reverseOnlyLetters(String S) {
            char[] sArr = S.toCharArray();
            int l = 0, r = sArr.length - 1;

            while (l < r) {
                if (!Character.isLetter(sArr[l])) {
                    l++;
                    continue;
                }
                if (!Character.isLetter(sArr[r])) {
                    r--;
                    continue;
                }
                char temp = sArr[l];
                sArr[l++] = sArr[r];
                sArr[r--] = temp;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : sArr)
                sb.append(c);
            return sb.toString();
        }
    }

    @Test
    public void test() {
        String result = new Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!");
        System.out.println(result);
    }
}
