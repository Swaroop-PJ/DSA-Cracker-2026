class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k-1,sum=0;
        for(int i=0;i<=r;i++){
            sum+=nums[i];
        }
        int max_sum=sum;
        while(r<nums.length-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            max_sum=Math.max(max_sum,sum);
        }
        return (double)(max_sum)/k;
        
    }
}