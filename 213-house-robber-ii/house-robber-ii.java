import java.util.*;
class Solution {
    public static int f(int[] nums){
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(nums[i-1]+dp[i-2],0+dp[i-1]);
        }
        return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int nums1[]=Arrays.copyOfRange(nums,0,n-1);
        int nums2[]=Arrays.copyOfRange(nums,1,n);
        return Math.max(f(nums1),f(nums2));
        
    }
}