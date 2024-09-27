class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1) {
            if(target == nums[0]) return 0;
            else return -1;
        }
        int r = nums.length - 1;
        int l = 0;
        int mid = (r + l) / 2;
        while(l <= r) { //notice the index, make sure it can end
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
            mid = (r + l) / 2;
        }
        return -1;
    }
