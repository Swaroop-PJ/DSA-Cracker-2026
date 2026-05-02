class Solution {
    boolean isMatchingPair(char a,char b){
        if(a=='('&&b==')'||a=='{'&&b=='}'||a=='['&&b==']') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[') stack.push(ch);
            else{
                if(!stack.isEmpty()&&isMatchingPair(stack.pop(),ch)) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}