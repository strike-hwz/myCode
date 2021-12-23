package leetcode;

/**
 * @ClassName No0121_1
 * @Description 根据评论思路进行编码
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/23 16:11
 */
public class No0121_1 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int minPrice = prices[0];
        //动态规划思路，计算在 i当天卖出的最大利润
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            res = Math.max(res, prices[i]-minPrice);
        }
        return res;
    }
}
