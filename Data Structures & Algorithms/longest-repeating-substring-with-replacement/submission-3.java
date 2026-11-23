class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfreq=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<s.length()){
            int cnt=0;
            char ch=s.charAt(r);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
           maxfreq=Math.max(map.get(ch),maxfreq);
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            else{
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
            }

        r++;
        }
        return maxlen;
    }
}
