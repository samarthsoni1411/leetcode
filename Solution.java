public class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Main method for testing the buildArray function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
