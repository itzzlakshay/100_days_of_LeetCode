class Solution {
    public ListNode oddEvenList(ListNode head) {
         if(head==null || head.next==null)
            return head;
        ListNode evenHead = head.next;
        ListNode evenNode = evenHead;
        ListNode oddNode = head;
        while(oddNode.next!=null && evenNode.next!=null)
        {
            oddNode.next = oddNode.next.next; 
            oddNode = oddNode.next;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHead;
        return head;
    }
}
