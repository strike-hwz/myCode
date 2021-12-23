package leetcode;

/**
 * @ClassName No0121
 * @Description 买卖股票的最佳时机（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/17 17:47
 */
public class No0121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        //动态规划思路，计算在 i当天卖出的最大利润
        int[] dp = new int[len];
        int res = 0;
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i-1] + prices[i] - prices[i-1];
            dp[i] = Math.max(dp[i], 0);
            res = Math.max(dp[i], res);
        }
        return res;
    }
}
