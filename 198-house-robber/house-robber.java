class Solution {
    
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int prev2=0,current=-1;
        int prev1=nums[0];
        for(int i=2;i<=n;i++){
             current=Math.max(nums[i-1]+prev2,0+prev1);
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
}