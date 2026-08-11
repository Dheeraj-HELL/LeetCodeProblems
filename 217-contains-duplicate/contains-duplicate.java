class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean ans = false;
        for(int num:nums){
            if(set.add(num)){
                ans = false;
            }else{
                return true;
            }
        }
        return ans;
    }
}