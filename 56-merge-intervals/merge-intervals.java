class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        int[] newint = intervals[0];
        for(int i = 1; i<intervals.length ;i++){
            int[] inter = intervals[i];
            if(inter[0] <= newint[1]){
                newint[1] = Math.max(inter[1],newint[1]);
            }else{
                result.add(newint);
                newint = inter;
            }
        }
        result.add(newint);

        return result.toArray(new int[result.size()][]);
    }
}