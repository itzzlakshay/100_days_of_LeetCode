class Solution {
    public int peakIndexInMountainArray(int[] a) {
       int st =0, ed =a.length-1;
        int ans = -1;
        while(st<=ed){
            int mid = st + (ed-st)/2;
            if(a[mid]<a[mid+1]){
                ans = mid+1;
                st = mid+1;
            }
            else ed = mid-1;
        }
        return ans;  
    }
}
