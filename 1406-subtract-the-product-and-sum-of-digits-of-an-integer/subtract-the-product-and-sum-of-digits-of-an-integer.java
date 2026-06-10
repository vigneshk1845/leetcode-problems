class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        while(n>0){
            p =p*(n%10);
            s=s+(n%10);
            n=n/10;
        }
        return p-s;
    }
    
}