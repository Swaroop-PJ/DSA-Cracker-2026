class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        int j=0;
        for(int i=j+1;i<length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}