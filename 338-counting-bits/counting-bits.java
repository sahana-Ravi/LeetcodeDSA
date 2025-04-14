class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

}

//solution 2
    // public int bits(int i ,int c){
    //    if(i==0){
    //     return c;
    //    }
    //    if(i%2==1){
    //     c+=1;
    //    }
    //    return bits(i/2,c);
    // }
    // public int[] countBits(int n) {
    //     int[] a = new int[n+1];
    //     int c;
    //     for(int i=0;i<=n;i++){
    //         c=0;
    //         a[i]= bits(i,c);
    //     }
    //     return a;
    // }