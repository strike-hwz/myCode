package leetcode;

/**
 * @ClassName No0027
 * @Description 移除元素（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/11 18:09
 */
public class No0027 {
    public int removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length-offset; i++) {
            if (nums[i] == val){
                for (int j = nums.length-1-offset; j > i; j--) {
                    if (nums[j] != val){
                        nums[i] = nums[j];
                        offset++;
                        break;
                    }
                    offset++;
                }
            }
        }
        return nums.length-offset;
    }
}
