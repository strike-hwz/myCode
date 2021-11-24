package leetcode;

import java.util.HashSet;

/**
 * @ClassName No0859_1
 * @Description 参考评论思路来编程解答
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/23 15:44
 */
public class No0859_1 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length() || s.length() < 2)
            return false;
        if (s.equals(goal)) {
            HashSet<Character> checkSame = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (!checkSame.add(s.charAt(i)))
                    return true;
            }
            return false;
        }
        int[] diffIndex = new int[3];
        int diffCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (diffCount > 2)//有超过两个字符不同，即false
                return false;
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndex[diffCount] = i;
                diffCount++;
            }
        }
        //比较交换后的两个字符
        if (s.charAt(diffIndex[1]) == goal.charAt(diffIndex[0])
                && s.charAt(diffIndex[0]) == goal.charAt(diffIndex[1]))
            return true;
        return false;
    }
}
