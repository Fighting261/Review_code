/**
 * @ program: 20200808
 * @ Description：
 * @ CreateTime：2020/8/8 21:39
 * @ Author：Mr Zhang
 */
public class TestDemo {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    // 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k < 0) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(k > 0 && fast != null) {
            fast = fast.next;
            k--;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(k > 0) {
            return null;
        }
        return slow;
    }
}
