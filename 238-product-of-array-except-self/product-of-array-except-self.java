class Solution {
    public int[] productExceptSelf(int[] nums) {
            int n = nums.length, mult = 1;
    int[] ans = new int[n];
    for(int i = 0; i<n; i++){
        ans[i] = mult;
        mult*=nums[i];
    }
    for(int i: ans){
        System.out.println(i);
    }
    mult = 1;
    for(int j = n-1; j>=0; j--){
        System.out.println(ans[j]+"*"+mult+"="+ ans[j]*mult);
        ans[j]*=mult;
        System.out.println(mult+"*"+nums[j]+"="+ nums[j]*mult);
        mult*=nums[j];
    }
    return ans;
}
    }