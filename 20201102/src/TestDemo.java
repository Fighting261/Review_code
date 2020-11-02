class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo {
    //现有一链表的头指针 ListNode* pHead，给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
    public ListNode partition(ListNode pHead, int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        while(pHead != null){
            if(pHead.val < x){
                if(bs == null){
                    bs = pHead;
                    be = pHead;
                }else{
                    be.next = pHead;
                    be = be.next;
                }
            }else{
                if(as == null){
                    as = pHead;
                    ae = pHead;
                }else{
                    ae.next = pHead;
                    ae = ae.next;
                }
            }
            pHead = pHead.next;
        }
        if(bs == null){
            return as;
        }
        be.next = as;
        if(ae != null){
            ae.next = null;
        }
        return bs;
    }
}