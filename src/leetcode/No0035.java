package leetcode;

/**
 * @ClassName No0035
 * @Description 搜索插入位置（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/12 17:13
 */
public class No0035 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int start = 0, end = len-1, mid = 0;
        while (start <= end){
            mid  = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        int res;
        if (nums[mid] > target)
           res = mid;
        else
            return 0;
            return mid;
    }
}
