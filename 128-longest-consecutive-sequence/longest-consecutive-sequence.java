class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int count =0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int Maxlength =0;
        for(int num:set){
            if(!set.contains(num-1)){
                int length=1;
                int currNum=num;
                while(set.contains(currNum+1)){
                    currNum+=1;
                    length+=1;
                }
                Maxlength=Math.max(Maxlength,length);
            }
            
        }
        return Maxlength;
    }
}