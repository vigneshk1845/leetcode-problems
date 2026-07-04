class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       StringBuilder res=new StringBuilder(words.length);
       for(int i=0;i<words.length;i++)
       {
        int s=0;
        for(int j=0;j<words[i].length();j++)
        {
            s+=weights[words[i].charAt(j)-'a'];
        }
        res.append((char)('z'-(s%26)));

       }
        return res.toString();
    }
}
