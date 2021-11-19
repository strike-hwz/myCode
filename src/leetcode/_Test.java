package leetcode;

/**
 * @ClassName _Test
 * @Description TODO
 * @Author Ryan(hwz)
 * @Version 1.0.0
 * @Date 2021/10/19 14:06
 */
public class _Test {
    public static void main(String[] args) {
        No0237 test = new No0237();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        test.deleteNode(node1);
//        System.out.println(test.deleteNode(node1));
    }
}
