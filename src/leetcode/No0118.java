package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName No0118
 * @Description 杨辉三角（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/15 16:58
 */
public class No0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> elements = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    elements.add(1);
                }else {
                    elements.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(elements);
        }
        return res;
    }
}
