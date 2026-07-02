class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(char sc:s.toCharArray()) c^=sc;
        for(char cs:t.toCharArray()) c^=cs;
        return c;
    }
}