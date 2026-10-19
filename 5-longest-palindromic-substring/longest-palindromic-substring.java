class Solution {
    public record Stats(int start_index,int length){}
    public static Stats expand(int l,int r,String s){
        int n=s.length();
        while(l>=0&&r<=n-1&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return new Stats(l+1,r-1-l);
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return s;
        int start_index=0;
        int max_length=1;
        for(int i=0;i<n;i++){
            var odd=expand(i,i,s);
            if(odd.length()>max_length){
                max_length=odd.length();
                start_index=odd.start_index();
            }
            var even=expand(i,i+1,s);
             if(even.length()>max_length){
                max_length=even.length();
                start_index=even.start_index();
            }

        }
        return s.substring(start_index,max_length+start_index);
        
    }
}