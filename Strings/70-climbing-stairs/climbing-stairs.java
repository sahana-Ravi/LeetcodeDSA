class Solution {
    public int climbStairs(int n) {
       ArrayList<Integer>  dp =  new ArrayList<Integer>();
       dp.add(0);
       dp.add(1);
       for(int i=2; i<n+2;i++){
            dp.add(dp.get(i-2) + dp.get(i-1));
        }  
        return dp.get(n+1);
    }
}