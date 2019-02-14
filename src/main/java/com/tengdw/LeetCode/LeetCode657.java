package com.tengdw.LeetCode;

import org.junit.Test;

/**
 * 机器人能否返回原点
 * @author Tengdw t_dw@qq.com
 * @description
 * @date 2019/2/13 11:50
 */
public class LeetCode657 {
    class Solution {
        public boolean judgeCircle(String moves) {
            int x = 0, y = 0;
            char[] charArray = moves.toCharArray();
            for (char c : charArray) {
                switch (c) {
                    case 'R':
                        x++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'U':
                        y++;
                        break;
                    case 'D':
                        y--;
                        break;
                }
            }
            return x == 0 && y == 0;
        }
    }

    @Test
    public void test() {
        boolean b = new Solution().judgeCircle("UD");
        System.out.println(b);
    }
}
