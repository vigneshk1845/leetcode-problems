class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        
        return 1 << (32 - Integer.numberOfLeadingZeros(n) - 3 / (n + 1));
    }
}