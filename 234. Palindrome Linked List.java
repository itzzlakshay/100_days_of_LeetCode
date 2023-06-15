class Solution {
    public ListNode reverse (ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p2!=null){
            if(p1.val!=p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true ;
    }
}
