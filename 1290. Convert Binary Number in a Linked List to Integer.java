class Solution {
    public int getDecimalValue(ListNode head) {
        // ListNode curr = head;
        // int ans = 0;
        // while(curr != null){
        //     ans = ans *2 + head.val;
        //     ans++;
        // }
        // return ans;


         int ans = 0;

    for (; head != null; head = head.next)
      ans = ans * 2 + head.val;

    return ans;
    }
}
