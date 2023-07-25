class Solution
 {
    public int largestAltitude(int[] gain)
     {
        int max=0;
        int t=0;
        for(int i=0;i<gain.length;i++)
        {
            t=t+gain[i];
            max=Math.max(max,t);
        }
        return max;
    }
}
