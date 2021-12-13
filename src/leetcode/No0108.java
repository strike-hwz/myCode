package leetcode;

import org.omg.PortableServer.RequestProcessingPolicy;

/**
 * @ClassName No0108
 * @Description 将有序数组转换为二叉搜索树（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/13 15:20
 */
public class No0108 {
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode root = new TreeNode(nums[(nums.length-1)/2]);
        getRoot(0, nums.length-1, nums, root);
        return root;
    }
    public void getRoot(int start, int end, int[] nums, TreeNode root){
        if (start > end){
            return;
        }

    }
}
