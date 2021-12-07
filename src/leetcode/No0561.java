package leetcode;

import java.util.Arrays;

/**
 * @ClassName No0561
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/7 10:18
 */
public class No0561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
