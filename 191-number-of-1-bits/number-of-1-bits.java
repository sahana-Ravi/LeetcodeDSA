class Solution {
    public int bits(int n,int c){
        if(n%2==1){
            c+=1;
        }
        if(n==0){
            return c;
        }
        return bits(n/2,c);
    }
    public int hammingWeight(int n) {
        int c=0;
        c= bits(n,c);
        return c;
    }
    
}