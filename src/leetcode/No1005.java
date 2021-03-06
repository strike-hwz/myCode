package leetcode;

import java.util.Arrays;

/**
 * @ClassName No1005
 * @Description K次取反后最大化的数组和
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/3 9:13
 */
public class No1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        //不预先排序，直接遍历数组也行
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                break;
            }
            if (k <= 0) {
                break;
            }
            nums[i] = -nums[i];
            k--;
        }
        int sum = Arrays.stream(nums).sum();
        //对 k 进行奇偶判断
        if (k % 2 == 0) {
            return sum;
        }

//        Arrays.sort(nums);
//        return sum-2*nums[0];
        return sum-2*Arrays.stream(nums).min().orElse(0);
    }
}
