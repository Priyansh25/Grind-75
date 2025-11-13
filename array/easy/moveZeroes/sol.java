package array.easy.moveZeroes;

class Solution {
    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length) {
            if(nums[i]==0) {
                if(nums[j]!=0 && i<j) { // Very imp condition i < j
                    swap(nums, i, j);
                }
                else {
                    j++;
                }
            }
            else if(nums[i]!=0) {
                i++;
            }
        }
    }

    public static void main() {
        int [] nums = new int[]{1,0};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}