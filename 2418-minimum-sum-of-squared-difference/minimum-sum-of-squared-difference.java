import java.util.*;
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int maxDiff=0;
        long totalK=(long)(k1+k2);
        int diff[]=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            maxDiff=Math.max(diff[i],maxDiff);
        }
        if(maxDiff==0) return 0;
        int freq[]=new int[maxDiff+1];
        Arrays.fill(freq,0);
        for(int i=0;i<n;i++){
            freq[Math.abs(nums1[i]-nums2[i])]++;
        }
        for(int i=maxDiff;i>0;i--){
            if(totalK>=(long)freq[i]){
                freq[i-1]+=freq[i];
                totalK-=freq[i];
                freq[i]=0;
            }
            else{
                freq[i]-=totalK;
                freq[i-1]+=(int)totalK;
                totalK=0;
            }
        }
        long sum=0;
        for(int i=0;i<=maxDiff;i++){
            sum+=(long)i*i*freq[i];
        }
        return sum;



       

    }
}