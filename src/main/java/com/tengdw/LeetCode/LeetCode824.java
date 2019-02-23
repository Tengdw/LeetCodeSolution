package com.tengdw.LeetCode;

import org.junit.Test;

/**
 * 山羊拉丁文
 * @author: Tengdw t_dw@qq.com
 * @create: 2019-02-23 23:18
 **/
public class LeetCode824 {
    class Solution {
        public String toGoatLatin(String S) {
            String[] sarr = S.split(" ");
            StringBuilder resultsb = new StringBuilder();
            for (int i = 0; i < sarr.length; i++) {
                String temp = sarr[i];
                char c = temp.charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    resultsb.append(temp);
                } else {
                    resultsb.append(temp.substring(1, temp.length()));
                    resultsb.append(c);
                }
                resultsb.append("ma");
                for (int j = 0; j < i + 1; j++)
                    resultsb.append("a");
                if (i < sarr.length - 1)
                    resultsb.append(" ");
            }
            return resultsb.toString();
        }
    }

    @Test
    public void test() {
        String s = new Solution().toGoatLatin("The quick brown fox jumped over the lazy dog");
        System.out.println(s);
    }
}
