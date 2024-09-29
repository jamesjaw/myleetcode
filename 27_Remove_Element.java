class Solution {
    public int removeElement(int[] nums, int val) {
        //double pointer
        int slow = 0;
        int fast = 0;
        int count = 0;
        while(fast < nums.length) {
            if(nums[fast] != val) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                count++;
                slow++;
                fast++;
            }
            else fast++;
        }
        return count;
    }
}
