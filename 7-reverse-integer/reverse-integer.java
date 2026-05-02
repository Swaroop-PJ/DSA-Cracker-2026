class Solution {
    public int reverse(int x) {
        int isneg=0;
        if(x<0){
            isneg=1;x*=-1;
        } 
        int rev=0;
        while(x>0){
            int rem=x%10;
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&rem>((isneg==1)?8:7))) return 0;
            rev=rev*10+rem;
            x/=10;
        }
        return (isneg==1)?-1*rev:rev;
    }
}