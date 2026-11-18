class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int maxval=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                while(set.contains(num+1)){
                    num++;
                    count++;
                    
                }
                maxval=Math.max(maxval,count);
            }
        }
        return maxval;
    }
}
