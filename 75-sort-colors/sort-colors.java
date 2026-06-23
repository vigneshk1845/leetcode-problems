class Solution {
    public void sortColors(int[] nums) {
       // Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>=nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
       }
    }
}