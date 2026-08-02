class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr=new ArrayList<>();
        char[] parr=p.toCharArray();
        char[] sarr=s.toCharArray();
        Arrays.sort(parr);
        for(int i=0;i<=sarr.length-p.length();i++)
        {
            char[] subarr=Arrays.copyOfRange(sarr,i,i+p.length());
            Arrays.sort(subarr);
            if(Arrays.equals(subarr,parr))
            {
                arr.add(i);

            }
        }

        return arr;
        
    }
}