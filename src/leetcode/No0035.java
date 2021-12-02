package leetcode;

/**
 * @ClassName No0035
 * @Description 搜索插入位置（easy）要求时间复杂度为 log(n)，那么用二分查找法
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/12 17:13
 */
//nums为有序数组，对target进行查找，若找到返回序号，没找到则按序插入并返回插入的序号
public class No0035 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int start = 0, end = len-1, mid = 0;
        //若最后未找到，那start指向比target大的邻位，end指向比target小的邻位，此时返回的插入序号为start
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
        return start;
    }
}
