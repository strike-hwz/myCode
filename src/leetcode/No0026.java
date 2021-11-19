package leetcode;

import java.util.Arrays;

/**
 * @ClassName No0026
 * @Description 删除有序数组中的重复项（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/9 15:17
 */
//可行，但是性能不够好
public class No0026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1)
            return 0;
        Arrays.sort(nums);
        int flag = 0;
        int temp = nums[flag];
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp){
                res++;
                nums[++flag] = nums[i];
                temp = nums[i];
            }
        }
        return res;
    }
}
