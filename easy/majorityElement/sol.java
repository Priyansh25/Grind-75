package easy.majorityElement;
class Solution {
    public int majorityElement(int[] nums) {

        int element = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }
            else {
                count--;
                if (count == 0) {
                    element = nums[i];
                    count = 1;
                }
            }
        }
        return element;
    }

    public static void main() {
        Solution solution = new Solution();
        int[] nums = new int[]{3,2,2};
        System.out.println(solution.majorityElement(nums));

    }
}