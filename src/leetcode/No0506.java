package leetcode;

import java.util.Arrays;

/**
 * @ClassName No0506
 * @Description 相对名次（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/2 10:35
 */
public class No0506 {
    public String[] findRelativeRanks(int[] score) {
        int[] rank = score.clone();
        Arrays.sort(rank);
        int len = rank.length;
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (score[i] == rank[j]) {
                    switch (len - j) {
                        case 1:
                            res[i] = "Gold Medal";
                            break;
                        case 2:
                            res[i] = "Silver Medal";
                            break;
                        case 3:
                            res[i] = "Bronze Medal";
                            break;
                        default:
                            res[i] = String.valueOf(len - j);
                            break;
                    }
                }
            }
        }
        return res;
    }
}
