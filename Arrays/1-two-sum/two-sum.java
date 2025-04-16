class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
       int[] res = new int[2];
       int val;
       for(int i=0;i<nums.length;i++){
          val = target-nums[i];
          if(h.containsKey(val) && h.get(val)!=i){
             res[0] = i;
             res[1] = h.get(val);
             return res;
          }
          else{
            h.put(nums[i],i);
          }

       }
      return res;
     }
}