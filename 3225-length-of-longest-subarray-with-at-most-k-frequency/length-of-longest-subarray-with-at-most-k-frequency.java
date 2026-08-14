class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int left =0, right=0;
        int ans=0;
        while(left<=right && right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.get(nums[right])>k){
                while(map.get(nums[right])>k){
                    // map.update(nums[left],freq-1);
                    map.put(nums[left], map.get(nums[left])-1);
                    left++;
                }
                
            }
            
            right++;
            ans=Math.max(ans,right-left);
        }
        return ans;
    }
}