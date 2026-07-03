class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> hi=new HashSet<>();
        int count=0;
        char[] ch=s.toCharArray();
        for(char num:ch){
            hi.add(num);
        }for(char o:hi) count++;
        return count;

    }
}