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
        return getUnit(0, nums.length-1, nums, new TreeNode());
    }
    public TreeNode getUnit(int start, int end, int[] nums, TreeNode root){
        if (start > end){
            return null;
        }
        int mid = (start + end) / 2;
        root = new TreeNode(nums[mid]);
        root.left = getUnit(start, mid-1, nums, root.left);
        root.right = getUnit(mid+1, end, nums, root.right);
        return root;
    }
}
