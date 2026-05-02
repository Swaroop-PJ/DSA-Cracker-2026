class Solution {
    public int myAtoi(String s) {
        int digitseen=0,ispos=1,isneg=0,charseen=0;
        long sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(charseen==0){
                if(ch=='-') {isneg=1; charseen=1;
                continue;}
                if(ch=='+') {ispos=1; charseen=1;
                continue;}
                if(ch==32) continue;

            }
            if(ch>=48&&ch<=57){
                digitseen=charseen=1;
                int rem=ch-'0';
                if((sum>Integer.MAX_VALUE/10)||((sum==Integer.MAX_VALUE/10)&&rem>(isneg==1? 8:7))){
                    return isneg==1?Integer.MIN_VALUE: Integer.MAX_VALUE;
                }
                sum=sum*10+(rem);

            }
            else{ break;
            }   
        }
        return (int)((isneg==1)? -1*sum:sum);
        
    }
}