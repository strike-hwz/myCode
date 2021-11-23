package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName No0384
 * @Description 打乱数组（medium）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/22 15:16
 */
//TODO 没通过所有用例，洗牌算法，待完成
public class No0384_TODO {
    int[] nums;
    public No0384_TODO(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums)
            numList.add(num);
        int len = nums.length;
        int[] res = new int[len];
        Random selection = new Random();
        for (int i = 0; i < len-1; i++) {
            int selectNo = selection.nextInt(len-1-i);
            res[i] = numList.get(selectNo);
            numList.remove(selectNo);
        }
        res[len-1] = numList.get(0);
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */