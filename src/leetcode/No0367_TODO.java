package leetcode;

/**
 * @ClassName No367
 * @Description 有效的完全平方数
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/4 13:52
 */
//TODO 不对，要修改并重新提交
public class No0367_TODO {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num; i++) {
            if (i*i == num)
                return true;
        }
        return false;
    }
}
