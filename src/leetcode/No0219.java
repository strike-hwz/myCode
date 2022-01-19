package leetcode;

/**
 * @ClassName No0219 存在相同元素II（easy）
 * @Description 根据题目优化后的暴力求解
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2022/1/19 16:34
 */
public class No0219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j <= i+k && j < len; j++) {
              if (nums[j] == nums[i]){
                  return true;
              }
            }
        }
        return false;
    }
}
