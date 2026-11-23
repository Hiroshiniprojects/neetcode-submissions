class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfreq=0;
        int []freq=new int[26];
        while(r<s.length()){
            int cnt=0;
            char ch=s.charAt(r);
            freq[ch-'A']++;
           maxfreq=Math.max(freq[ch-'A'],maxfreq);
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            else{
                char left=s.charAt(l);
                freq[left-'A']--;
                l++;
            }

        r++;
        }
        return maxlen;
    }
}
