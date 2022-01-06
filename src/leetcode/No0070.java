package leetcode;

/**
 * @ClassName No0070
 * @Description 爬楼梯（easy）【采用递归方法超时，用动态规划】
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2022/1/6 15:05
 */
public class No0070 {
    public int climbStairs(int n) {
        return recursion(n);
    }

    /**
     * 用递归超时
     */
    public int recursion(int n) {
        if (n <= 2){
            return n;
        }
        return recursion(n-1) + recursion(n-2);
    }
}
