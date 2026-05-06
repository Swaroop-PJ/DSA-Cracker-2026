class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        int j=-1;
        for(int i=0;i<length-1;i++){
            if(nums[i+1]==nums[i]){
                j=i;
                break;
            }
        }
        if(j==-1) return length;
        for(int i=j+1;i<length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}