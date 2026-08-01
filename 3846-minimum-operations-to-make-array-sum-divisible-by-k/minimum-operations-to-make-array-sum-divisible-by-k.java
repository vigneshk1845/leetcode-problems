class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int n:nums){
           c=c+n;
        }
        return c%k;
    }
}