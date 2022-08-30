public class LC021MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //创建一个虚拟的表头，防止空指针
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while (list1 != null && list2 != null) {
            //比较l1和l2两个指针看谁大谁小，小的就接到cur链表下一个
            if (list1.val < list2.val) {
                cur.next = list1;
                //cur链表往后
                cur = cur.next;
                //list1链表指针往后
                list1 = list1.next;
            } else {
                cur.next = list2;
                //cur链表往后
                cur = cur.next;
                //list2链表指针往后
                list2 = list2.next;
            }
        }
        //如果其中一个链表是空值则cur链表直接接到非空链表上
        if (list1 == null) {
            cur.next = list2;
        } else if (list2 == null) {
            cur.next = list1;
        }

        //返回虚拟链表后的链表
        return dummyHead.next;
    }
}
