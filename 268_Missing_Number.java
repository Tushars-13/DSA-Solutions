class Solution {
    public int missingNumber(int[] nums) {
        // we will use SUM method
        int n = nums.length;

        int expected_sum = (n*(n+1)) / 2;
        int actual_sum = 0;

        for(int i=0; i<n; i++){
            actual_sum = actual_sum + nums[i];
        }

        int missing_number  = expected_sum - actual_sum; 

        return missing_number;
    }
}
