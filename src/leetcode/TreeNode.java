package leetcode;

/**
 * @ClassName TreeNode
 * @Description 预先定义树节点
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/12/13 15:18
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
}
