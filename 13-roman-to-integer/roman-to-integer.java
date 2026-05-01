class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('M',1000);
        map.put('C',100);
        map.put('D',500);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        int num=0;
        int lastseen=-1;
        for(int i=s.length()-1;i>=0;i--){
            int a=map.get(s.charAt(i));
            if(a<lastseen) num=num-a;
            else num+=a;
            lastseen=a;
           
        }
        return num;
      
        
    }
}