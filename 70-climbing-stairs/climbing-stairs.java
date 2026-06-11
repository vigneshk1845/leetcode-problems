class Solution {
    public int climbStairs(int n) {
        int s=1;int v=1;
        for(int i=1;i<n;i++){
          int temp=v;
          v=s+v;
          s=temp;

        }return v;
    }
}