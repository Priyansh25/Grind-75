import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false;

        HashMap<Character, Integer>map=new HashMap<>();
        HashMap<Character, Integer>mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(!map.get(s.charAt(i)).equals(mp.get(s.charAt(i))))return false;
        }
        return true;
    }
}

public void main() {
    Solution sol=new Solution();
    System.out.println(sol.isAnagram("anagram", "nagaram"));
}