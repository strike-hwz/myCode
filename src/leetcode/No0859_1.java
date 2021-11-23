package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName No0859_1
 * @Description TODO
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
        }
        int[] diffIndex = new int[2];
        int diffCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (diffCount > 1)
                break;
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndex[diffCount] = i;
                diffCount++;
            }
        }
        //交换字符串中两个字符的位置，todo 以下存在substring方法边界问题
        StringBuilder newS = new StringBuilder(s.substring(0, diffIndex[0]));
        newS.append(s.charAt(diffIndex[1])).append(s.substring(diffIndex[0]+1, diffIndex[1]));
        newS.append(s.charAt(diffIndex[0])).append(s.substring(diffIndex[1]+1, s.length()));

        if (newS.toString().equals(goal))
            return true;
        return false;
    }
}
