package strings.easy.longestCommonPrefix;

import java.util.Arrays;

class Solution {
    public String comparator(String s ,String t){
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)!=t.charAt(j)){
                break;
            }
            i++;
            j++;
        }
        return s.substring(0,i);
    }

    public String longestCommonPrefix(String[] strs) {

        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            ans = new Solution().comparator(strs[i],ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs=new String[]{"flower","flow","flight"};
        System.out.println("longestCommonPrefix for " + Arrays.toString(strs) + " is "+ solution.longestCommonPrefix(strs));
    }
}