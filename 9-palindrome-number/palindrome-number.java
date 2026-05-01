class Solution {
    // int digits(int x){
    //    int digits=0;
    //     while(x>0){
    //         digits++;
    //         x/=10;

    //     }
    //     return digits;
    // }
    // int expo(int a, int b){
    //     int result=1;
    //     for(int i=1;i<=b;i++){
    //         result*=a;
    //     }
    //     return result;
    // }
     public boolean isPalindrome(int x) {
    //     if(x<0) return false;
    //     int digits=digits(x);
    //     while(digits>1){
    //         int first=x%(10);
    //         int last=x/expo(10,digits-1);
    //         if(first!=last) return false;
    //         x=x/10;
    //         digits--;
    //         x=x%expo(10,digits-1);
    //         digits--;

    //     }
    //     return true;
    if(x<0||x%10==0&&x!=0) return false;
    int reversedHalf=0;
    while(x>reversedHalf){
        reversedHalf=reversedHalf*10+(x%10);
        x/=10;
    }
    return (x==reversedHalf||x==reversedHalf/10);

    
 }

}