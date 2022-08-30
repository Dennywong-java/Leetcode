public class LC剑指Offer22getKthFromEnd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        //思路：双指针：两个指针的距离为k，当第一个指针走到最后时候，第二个指针则为末尾倒数第K位的值。
        ListNode first = head;
        //先让first走到k的位置
        for (int i = 0; i < k; i++) {
            first = first.next;
        }

        ListNode second = head;
        //在第一个指针不为空值的情况下
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
}
