class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left=0, right=1;

        while(left<right){
            right=left+1;
            while(right<numbers.length){
                if(numbers[left]+numbers[right]==target){
                    return new int[]{left+1,right+1};
                }
                right++;
            }
            left++;
        }
        return new int[]{0,0};
    }
}