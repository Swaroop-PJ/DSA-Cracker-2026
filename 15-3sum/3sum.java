class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1,right=length-1,sum=-1*nums[i];
            while(left<right){
                int total=nums[left]+nums[right];
                if(total>sum) right--;
                else if(total<sum) left++;
                else {
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    while(left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
               
            }
        }
        return list;

        
    }
}