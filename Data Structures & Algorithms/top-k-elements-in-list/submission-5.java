class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>count=new HashMap<>();
        List<Integer>[]list=new ArrayList[nums.length+1];
        int[]arr=new int[k];
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:count.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(list[val]==null){
             list[val]=new ArrayList<>();
            }
            list[val].add(key);
        }
        int c=0;
        for(int i=list.length-1;i>=0 && c<k;i--){
            if(list[i]!=null){
                for(int n:list[i]){
                    arr[c]=n;
                    c++;
                }
                if(c==k){
                    break;
                }
            }

        }
        return arr;
    }
}
