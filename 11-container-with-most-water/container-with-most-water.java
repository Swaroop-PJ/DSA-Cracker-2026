class Solution {
    public int maxArea(int[] height) {
        int maxCap=-1;
        int left=0,right=height.length-1;
        while(left<right){
            int Cap=Math.min(height[left],height[right])*(right-left);
            maxCap=(Cap>maxCap)?Cap:maxCap;
            if(height[left]>height[right]) right--;
            else if(height[left]<height[right]) left++;
            else {
                left++;
                right--;
            }
        }
        return maxCap;
    }
}