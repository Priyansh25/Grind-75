class Solution {
    public int longestPalindrome(String s) {

        int []freq=new int[52];
        boolean firstOdd=false;
        int len=0;
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <='z')
                freq[c - 'a']++;
            else freq[c-'A'+26]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]%2 != 0){
                if(!firstOdd){
                    firstOdd=true;
                    len=len+freq[i];
                }else{
                    len=len+freq[i]-1;
                }
            }else{
                len=len+freq[i];
            }
        }
        return len;
    }
}
public void main(){
    Solution sol=new Solution();
    System.out.println("longest palindrome: "+sol.longestPalindrome("zeusnilemacaronimaisanit"));
}