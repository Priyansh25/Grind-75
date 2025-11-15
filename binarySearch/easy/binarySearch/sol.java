package binarySearch.easy.binarySearch;

class Solution {
    public int bsearch(int []nums,int low,int high,int target){

        int mid=low+(high-low)/2;

        while(low<=high){
            if(nums[mid]==target)return mid;
            if(nums[mid]< target)return bsearch(nums,mid+1,high,target);
            if(nums[mid]> target)return bsearch(nums,low,mid-1,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        return bsearch(nums,low,high,target);
    }
    public void main() {
        Solution solution = new Solution();
        System.out.println("Bsearch " + solution.search(new int[]{-1,0,3,5,9,12}, 15));
    }
}