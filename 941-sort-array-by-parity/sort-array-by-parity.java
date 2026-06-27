class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int b=0;
        int c=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[b]=nums[i];
                b++;
            }else{
                arr[c]=nums[i];
                c--;
            }
        }return arr;
    }
}