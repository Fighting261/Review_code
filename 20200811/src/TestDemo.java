/**
 * @ program: 20200811
 * @ Description：
 * @ CreateTime：2020/8/11 15:30
 * @ Author：Mr Zhang
 */
public class TestDemo {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    //给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构
    public boolean chkPalindrome(ListNode A) {
        // write code here
        if(A == null) {
            return false;
        }
        if(A.next == null) {
            return true;
        }
        ListNode slow = A;
        ListNode fast = A;
        //先找中间节点
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //反转后半部分
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //此时slow在最后一个节点
        while(A != slow) {
            if(A.val != slow.val) {
                return false;
            }
            if(A.next == slow) {
                return true;
            }
            slow = slow.next;
            A = A.next;
        }
        return true;
    }

    //编写一个程序，找到两个单链表相交的起始节点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;
        //1.求长度
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA-lenB;
        if(lenA - lenB < 0){
            pl = headB;
            ps = headA;
            len = lenB- lenA;
        }
        //2.让pl和ps在同一个起点
        while(len > 0){
            pl = pl.next;
            len--;
        }
        while(ps != pl) {
            pl = pl.next;
            ps = ps.next;
        }
        if(pl!= null) {
            return pl;
        }
        return null;
    }
}
