/**
 * @ program: 20200809
 * @ Description：
 * @ CreateTime：2020/8/9 14:06
 * @ Author：Mr Zhang
 */
public class TestDemo {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // 将两个有序链表合并为一个新的有序链表并返回
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        if(l1 == null) {
            tmp.next = l2;
        }
        if(l2 == null) {
            tmp.next = l1;
        }
        return newHead.next;
    }

    // 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        while(pHead != null) {
            if(pHead.val < x) {
                if(bs == null) {
                    bs = pHead;
                    be = pHead;
                }else {
                    be.next = pHead;
                    be = be.next;
                }
            }else {
                if(as == null) {
                    as = pHead;
                    ae = pHead;
                }else {
                    ae.next = pHead;
                    ae = ae.next;
                }
            }
            pHead = pHead.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(ae != null) {
            ae.next = null;
        }
        return bs;
    }

    // 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null){
            return pHead;
        }
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode prev = head;
        ListNode last = prev.next;
        while(last != null){//last永远在前面
            //先找到重复的开始
            while(last.next != null && last.val != last.next.val){
                prev = prev.next;
                last = last.next;
            }
            //在找到重复的范围
            while(last.next != null && last.val == last.next.val){
                last = last.next;
            }
            //走到这里结果一共有三种,注意：prev永远指向的是前驱有效起始节点：
            //1. last.next != null 并且 (prev, last] 限定了一段重复范围，此时进行去重
            //2. last.next == null && (prev, last] 限定了一段重复范围，此时进行去重，最后相当于prev->next = nullptr
            //3. last.next == null && prev.next == last,这说明，从本次循环开始，大家都不相同，就不需
            //要进行去重，这个是特殊情况
            if(prev.next != last){
                //说明是一段范围，可以去重
                prev.next = last.next;
            }
            last = last.next; //走这一步，就是为了保证恢复的和最开始一致
        }
        return head.next;
    }


}
