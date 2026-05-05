class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        long dvd=Math.abs((long)dividend);
        long div=Math.abs((long)divisor);
        int ans=0;
        for(int i=31;i>=0;i--){
            if((dvd>>i)>=div){
                ans+=1<<i;
                dvd=dvd-(div<<i);
            }
        }
        if((dividend>0)^(divisor>0)) return (~ans)+1;
        return ans;
      
    }
}