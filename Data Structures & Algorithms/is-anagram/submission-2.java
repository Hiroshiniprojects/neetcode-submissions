class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map1.containsKey(ch)){        
               map1.put(ch,1);
            }
            else{
                map1.put(ch,map1.getOrDefault(ch,1)+1);
            }
        }
        for(int j=0;j<t.length();j++){
            char ch2=t.charAt(j); 
            if(!map2.containsKey(ch2)){
                map2.put(ch2,1);
            }
            else{
                map2.put(ch2,map2.getOrDefault(ch2,1)+1);
            }
        }
        if(map1.equals(map2)){
            return true;
        } 
return false;
    }
}
