class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int n=s.length();
        int max_length=1;
        int start_index=0;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                max_length=2;
                start_index=i;
            }
        }

        for(int k=2;k<n;k++){
            for(int i=0;i<n-k;i++){
                if(s.charAt(i)==s.charAt(i+k)){
                    if(dp[i+1][i+k-1]==1){
                        dp[i][i+k]=1;
                        start_index=i;
                        max_length=k+1;
                    }
                    else{
                        dp[i][i+k]=0;
                    }
                }
            }
        }
        return s.substring(start_index,start_index+max_length);
    }
}