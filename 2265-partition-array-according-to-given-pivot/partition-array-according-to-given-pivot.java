class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int arr[]=new int[n];
        int l=0;
        int r=n-1;
        int i=0;
        int j=n-1;
        while(i<n){
            if(nums[i]<pivot){
                 arr[l++]=nums[i];
            }
            if(nums[j]>pivot){
                arr[r--]=nums[j];
            }
            i++;
            j--;
        }
        while(l<=r){
            arr[l++]=pivot;
        }
        return arr;
    }
}