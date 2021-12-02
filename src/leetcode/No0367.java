package leetcode;

/**
 * @ClassName No0367
 * @Description 有效的完全平方数（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/4 13:52
 */
//时间复杂度较高
public class No0367 {
    public boolean isPerfectSquare(int num) {
        if (num <= 4) {
            if (num == 1 || num == 4)
                return true;
            else
                return false;
        }else {
            int limit = num / 2;
            for (int i = 2; i < limit; i++) {
                if (i * i == num)
                    return true;
            }
            return false;
        }
    }
}
