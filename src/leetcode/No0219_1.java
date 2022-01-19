package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName No0219_1
 * @Description 利用哈希表存储遍历过的数据
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2022/1/19 16:52
 */
public class No0219_1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }
            map.put(num, i);
        }
        return false;
    }
}
