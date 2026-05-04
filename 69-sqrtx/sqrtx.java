class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
       int lb=1,up=x/2;
       int sroot=0;
       while(lb<=up){
        int mid=lb+(up-lb)/2;
        if(mid==x/mid) return mid;
        else if(mid<x/mid){
            sroot=mid;
            lb=mid+1;
        }
        else up=mid-1;
       }
       return sroot;

    }
}