package leetcode;

import java.util.HashSet;

/**
 * @ClassName No575
 * @Description 分糖果（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/1 15:55
 */
public class No0575 {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length;
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0; i < len; i++) {
            check.add(candyType[i]);
            if (i >= len/2)
                if (check.size() >= (len/2))
                    return len/2;
        }
        return check.size();
    }
}
