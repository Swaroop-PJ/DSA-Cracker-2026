class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0||nums.length==1) return null;
        int complement=-1;
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            complement=target-nums[i];
            if(map.containsKey(complement)){
                ans[0]=i;
                ans[1]=map.get(complement);
                
                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;



        
    }
}