class Solution {
    public boolean isPalindrome(String s) {
        char[] ch=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(ch[right])){
                right--;
            }
            else if(Character.toLowerCase(ch[left])==Character.toLowerCase(ch[right])){
                left++;
                right--;
            }
            else{
                return false;
            }
    
        }
        return true;
    }
}
