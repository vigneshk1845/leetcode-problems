class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int d=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                c+=nums[j];
                if(c==goal){
                    d++;
                }
            }
        }
        return d;
    }
}