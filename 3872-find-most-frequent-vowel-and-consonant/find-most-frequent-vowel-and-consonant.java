class Solution {
    public int maxFreqSum(String s){ 
      Map<Character,Integer> hi=new HashMap<>();
        int con=0; int vow=0;
        for(char ch:s.toCharArray()){
            hi.put(ch,hi.getOrDefault(ch, 0)+1);
        }
        String v="aeiou";int maxv=0;int maxc=0;
       for(Character key:hi.keySet()){
               if(v.indexOf(key)==-1){
                    maxc=Math.max(maxc,hi.get(key));
    }           else{
                     maxv=Math.max(maxv,hi.get(key));
    }
  }return maxv+maxc;
    }
}