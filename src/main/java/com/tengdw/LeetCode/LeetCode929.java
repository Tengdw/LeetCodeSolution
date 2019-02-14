package com.tengdw.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 独特的电子邮件地址
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/2/13 11:24
 */
public class LeetCode929 {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<>();
            for (String email : emails) {
                String[] split = email.split("@");
                if (split.length == 1) continue;
                char[] nameCharArr = split[0].toCharArray();
                StringBuilder sb = new StringBuilder();
                for (char c : nameCharArr) {
                    if (c == '+') break;
                    if (c == '.') continue;
                    sb.append(c);
                }
                set.add(sb.toString() + split[1]);
            }
            return set.size();
        }
    }
}
