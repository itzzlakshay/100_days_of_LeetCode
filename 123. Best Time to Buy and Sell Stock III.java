class Solution {
    public int maxProfit(int[] prices) {
        int e1=Integer.MAX_VALUE;
        int e2=Integer.MAX_VALUE;
        int s1=0;
        int s2=0;
        for(int i:prices){
            e1=Math.min(e1,i);
            s1=Math.max(s1,i-e1);
            e2=Math.min(e2,i-s1);
            s2=Math.max(s2,i-e2);
        }
        return s2;
    }
}
