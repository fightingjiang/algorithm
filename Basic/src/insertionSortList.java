public class insertionSortList {
    public static void main(String[] args) {

    }
    public ListNode insertionSortList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head,curr = head.next;
        while (curr!=null){
            if(lastSorted.val<=curr.val){
                lastSorted = lastSorted.next;
            }else {
                ListNode pre = dummyHead;
                while (pre.next.val<=curr.val){
                    pre = pre.next;
                }
                lastSorted.next = curr.next;
                curr.next = pre.next;
                pre.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

//class Solution {
//    public ListNode insertionSortList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode lastSorted = head, curr = head.next;
//        while (curr != null) {
//            if (lastSorted.val <= curr.val) {
//                lastSorted = lastSorted.next;
//            } else {
//                ListNode prev = dummyHead;
//                while (prev.next.val <= curr.val) {
//                    prev = prev.next;
//                }
//                lastSorted.next = curr.next;
//                curr.next = prev.next;
//                prev.next = curr;
//            }
//            curr = lastSorted.next;
//        }
//        return dummyHead.next;
//    }
//}

