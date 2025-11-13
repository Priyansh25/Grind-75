package array.easy.squaresOfSortedArrays;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res = new int[nums.length];
        int k=res.length-1;
        int i=0,j=res.length-1;

        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                res[k--] = nums[j]*nums[j];
                j--;
            }
            else{
                res[k--] = nums[i]*nums[i];
                i++;
            }
        }
        return res;
    }

    public static void main() {
        int [] nums = {-5,-3,-2,-1,1,1,2,4,4};

        Solution soln=new Solution();
        System.out.println("Sorted squares array = " + Arrays.toString(soln.sortedSquares(nums)));
    }
}