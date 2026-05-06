class Solution {
    static {
        for(int i = 0; i < 1000; i++);
    }
    public void moveZeroes(int[] nums) {
        int length=nums.length;
        int j=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=0){
                if(i!=j){
                nums[j]=nums[i];
                nums[i]=0;
                }
                j++; 
            }
        }
        return;
    }
}