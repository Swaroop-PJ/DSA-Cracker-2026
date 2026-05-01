class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null) return 0;
        int length=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            String ch=String.valueOf(s.charAt(i));

            sb.append(ch);
            if(sb.indexOf(ch)!=sb.lastIndexOf(ch)){
                sb.delete(0,sb.indexOf(ch)+1);
            }
            length=Math.max(sb.length(),length);
           
        }
        return length;
        
    }
}