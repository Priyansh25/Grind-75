package array.easy.containsDuplicate;

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1)
                return true;
        }
        return false;
    }

    public static void main() {
        int[] nums=new int[]{1,2,4,4,5,6,7,8,9};
        System.out.println(new Solution().containsDuplicate(nums));
    }
}