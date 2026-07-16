class Solution {
    public int maxArea(int[] h) {
        
        int n = h.length;
        int m = 0;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h1=Math.min(h[i],h[j]);
                int b = h1*(j-i);
                if(m<b){
                    m=b;
                }
            }
        }return m;
    }
}
