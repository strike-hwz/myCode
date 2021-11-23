package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName No0859
 * @Description 亲密字符串（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/23 14:23
 */
public class No0859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.isEmpty() || goal.isEmpty())
            return false;
        if (s.length() != goal.length() || s.length() < 2)
            return false;
        List<Integer> diffIndex = new ArrayList<>();
        HashSet<Character> checkSame = new HashSet<>();
        boolean selfSame = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i))
                diffIndex.add(i);
            if (!selfSame)
                if (!checkSame.add(s.charAt(i)))
                    selfSame = true;
        }
        int countDiff = diffIndex.size();
        if (countDiff == 0)
            if (selfSame)
                return true;
        if (countDiff == 2)
            if (s.charAt(diffIndex.get(0)) == goal.charAt(diffIndex.get(1))
                    && s.charAt(diffIndex.get(1)) == goal.charAt(diffIndex.get(0)))
                return true;
        return false;
    }
}
