class Solution {
    public int[] evenOddBit(int n) {
        List<Integer> bin = new ArrayList<Integer>();
        while(n>0){
            bin.add(n%2);
            n=n/2;
        }
        int even=0;
        int odd =0;
        for(int i=0;i<bin.size();i++){
              if(bin.get(i)==1 && i%2==0){
                even++;
              }
              if(bin.get(i)==1 && i%2!=0){
                odd++;
              }
        }
        int[] ans = new int[2];
        ans[0] = even;
        ans[1] = odd;
        return ans;
    }
}