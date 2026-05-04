class Solution {
    public int lengthOfLastWord(String s) {
        int charseen=0,len=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==32){
                if(charseen==0)continue;
                else return len; 
            }
            charseen=1;
            len+=1;
        }
        return len;
        
    }
}