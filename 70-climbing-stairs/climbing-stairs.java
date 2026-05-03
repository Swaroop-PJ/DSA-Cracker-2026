class Solution {
    public int climbStairs(int steps) {
        //   if(steps==0) return 1;
        // if(steps==1) return climbStairs(steps-1);
        // return climbStairs(steps-1)+climbStairs(steps-2);
        if(steps<=2) return steps;

        int a=1,b=2,c=0;
        while(steps>2){
            c=a+b;
            a=b;
            b=c;
            steps--;
        }
        return c;


        
    }
}