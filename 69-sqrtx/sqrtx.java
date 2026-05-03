class Solution {
    public int mySqrt(int x) {
        int res=0;
        if(x<2) return x;
        for(int i=15;i>=0;i--){
            int bit=1<<i;
            if((res+bit)<=x/(res+bit)) res+=bit;
        }
        return res;
    }
}