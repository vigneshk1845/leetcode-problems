class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int count1 = 0;

        int block1 = 0;
        int block2 = 0;
        int maxx = 0;

        int i = 0;
        while(i<n){
            char ch = arr[i];

            if(ch=='0') {
                block1++;
                i++;
            }

            else{
                while(i<n && ch=='1'){
                    i++;
                    count1++;
                    if(i!=n)ch=arr[i];
                }
                
                while(i<n && ch=='0'){
                    i++;
                    block2++;
                    if(i!=n)ch=arr[i];
                }

                if(block1!=0 && block2!=0) maxx = Math.max(maxx, block1+block2);
                block1 = block2;
                block2 = 0;
            }

        }

        return count1 + maxx;

    }
}