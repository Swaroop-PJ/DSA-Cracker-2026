class Solution {
    int BinarySearch(int nums[],int target, boolean isFirst){
        int length=nums.length;
        int left=0,right=length-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                index=mid;
                if(isFirst) right=mid-1; 
                else left=mid+1;
            }
            else if(target<nums[mid]) right=mid-1;
            else left=mid+1;
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstIndex=BinarySearch(nums,target,true);
        int lastIndex=BinarySearch(nums,target,false);
        return new int[]{firstIndex,lastIndex};
      
    }
}