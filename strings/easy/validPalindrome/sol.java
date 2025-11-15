class Solution {
    public String parseString(String s) {
        String t = "";

        for (int i = 0; i < s.length(); i++) {
//            if(c is alphanum){
            if (Character.isLetterOrDigit(s.charAt(i))) {
//                t = t + s.charAt(i);
                t=t + Character.toLowerCase(s.charAt(i));
            }
        }
        return t;


    }
    public boolean isPalindrome(String s) {
        Solution sol=new Solution();
        String t=sol.parseString(s);

        //int i=0,j=s.length-1;
        int i=0,j=t.length()-1;
        while(i<=j){
//            if(s.char.at(i)!=s.char.at(j))
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

public void main() {
    Solution sol=new Solution();
    System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
}