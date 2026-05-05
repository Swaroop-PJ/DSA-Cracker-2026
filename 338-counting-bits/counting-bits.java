class Solution {
  
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
        int count=0,x=i;
        while(x>0){
            count+=x&1;
            x=x>>1;
        }
        arr[i]=count;

        }
        return arr;
    }
}