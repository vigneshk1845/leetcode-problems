class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastIndex.containsKey(nums[i])) {
                if (i - lastIndex.get(nums[i]) <= k) {
                    return true;
                }
            }

            lastIndex.put(nums[i], i);
        }

        return false;
    }
}