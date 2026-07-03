class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*nums.length];
        int k=arr.length-1;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[k-i]=nums[i];
        }
        return arr;
    }
}