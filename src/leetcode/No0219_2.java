package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName No0219_2
 * @Description 利用set作为滑动窗口
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2022/1/19 17:28
 */
public class No0219_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
