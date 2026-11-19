class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int l=0;
        int r=0;
        int maxlen=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
                }
            }
            set.add(ch);
            maxlen=Math.max(r-l+1,maxlen);
            r++;
        }
      return maxlen;
    }
}
