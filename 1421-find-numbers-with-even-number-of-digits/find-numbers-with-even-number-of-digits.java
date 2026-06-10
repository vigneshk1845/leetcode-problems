class Solution {
    public int findNumbers(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            int digit=0;
            while(nums[i]!=0){
                nums[i]/=10;
                digit++;
            }
            if(digit%2==0){
                n++;
            }
        }
return n;
        }
    }
