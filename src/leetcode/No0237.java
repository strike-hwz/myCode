package leetcode;

/**
 * @ClassName No237
 * @Description 删除单链表中的节点（easy）
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/11/2 14:45
 */
public class No0237 {
    public void deleteNode(ListNode node) {//node为要删除的节点
            node.val = node.next.val;
            node.next = node.next.next;
//        System.out.println(node);
//        System.out.println(node.val + ", " + node.next);
//        node = node.next; //java引用
//        System.out.println(node);
//        System.out.println(node.val + ", " + node.next);
    }
}
