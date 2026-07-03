class Solution {
    public int mirrorDistance(int n) {
        int sum=0;
        int x=n;
        while(n>0){
           int d=n%10;
           sum=sum*10+d;
           n=n/10;
        }
        if(x>sum){
            return x-sum;
        }else {
            return sum-x;
    }
    }
}