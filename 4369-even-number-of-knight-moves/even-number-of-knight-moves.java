class Solution {
        public boolean canReach(int[] s, int[] t) {
        return (s[0] + s[1] + t[0] + t[1]) % 2 == 0;  
    }
}