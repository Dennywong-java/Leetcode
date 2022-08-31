import java.util.HashMap;

public class LC1836RemoveDuplicatesFromanUnsortedLinkedList {
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

    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> count = new HashMap<>();
        //先遍历以便链表，获取每个值出现的次数
        ListNode p = head;
        while (p != null) {
            count.put(p.val, count.getOrDefault(p.val, 0) + 1);
            p = p.next;
        }
        //创建虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //再遍历一遍节点，把重复出现的节点剔除
        p = dummy;
        while (p != null) {
            //unique指针负责寻找不重复的节点
            ListNode unique = p.next;
            while (unique != null && count.get(unique.val) > 1) {
                //跳过重复节点，直到找到不重复的节点
                unique = unique.next;
            }
            //接入不重复的节点或尾部指针
            p.next = unique;
            //p前进，继续寻找不重复的节点
            p = p.next;
        }
        return dummy.next;
    }
}
