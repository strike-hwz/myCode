package leetcode;

/**
 * @ClassName No0026
 * @Description 删除有序数组中的重复项（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/9 15:17
 */
public class No0026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1)
            return 0;
        int currIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[currIndex]) {
                nums[++currIndex] = nums[i];
            }
        }
        return currIndex+1;
    }
}
