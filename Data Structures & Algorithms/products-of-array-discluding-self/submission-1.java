class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] prefix=new int[nums.length];
    int[] suffix=new int[nums.length];
    int[]arr=new int[nums.length];
    int product1=1;
    for(int i=0;i<nums.length;i++){
        prefix[i]=product1;
        product1*=nums[i];
    }
    int product2=1;
    for(int j=nums.length-1;j>=0;j--){
        suffix[j]=product2;
        product2*=nums[j];
    }
   for(int k=0;k<nums.length;k++){
     arr[k]=prefix[k]*suffix[k];
   }
   return arr;
    }
}  
