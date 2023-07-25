class Solution 
{
    public int maxArea(int[] height) 
    {
        int a=0;
        int b=height.length - 1;
        int max=0;
        while(a<b){
            int w=b-a;
            int h =Math.min(height[a], height[b]);
            int ar=h*w;
            max = Math.max(max,ar);
            if(height[a]<height[b]) 
            a++;
            else if(height[a] > height[b]) 
            b--;
            else 
            {
                a++;
                b--;
            }
        }
        return max;
    }
}
