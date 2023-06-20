class Solution {
    public ListNode reverse (ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;
        while (curr!=null){
            after = curr.next;
        curr.next = prev;
        prev = curr;
        curr = after;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        int Maxsum = 0;
        ListNode head1 = head;
        ListNode head2 = slow.next;
        while(head2 != null){
            int sum = head1.val + head2.val;
            if(Maxsum < sum){
                Maxsum = sum;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return Maxsum;

    }
}
