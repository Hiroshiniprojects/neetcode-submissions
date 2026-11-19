class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxval=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int b=right-left;
            int area=h*b;
            maxval=Math.max(area,maxval);
            if(heights[left]<=heights[right]){
                left++;
            }
            else{
                right--;
            }   

        }
        return maxval;
    }
}
