/**
 * @ program: 20200807
 * @ Description：
 * @ CreateTime：2020/8/7 21:37
 * @ Author：Mr Zhang
 */
public class TestDemo {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }


    // 删除链表中等于给定值 **val** 的所有节点
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }
    //反转链表(此方法超时)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode newHead = null;
        ListNode curNext = cur.next;
        while(cur != null) {

            cur.next = prev;
            prev = cur;
            cur = curNext;
            if(curNext == null) {
                newHead = cur;
            }
        }
        return newHead;
    }
}
