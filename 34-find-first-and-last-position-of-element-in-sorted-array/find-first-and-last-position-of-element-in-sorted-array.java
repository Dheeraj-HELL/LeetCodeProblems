class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int[] ans = new int[2];
        Arrays.fill(ans,-1);

        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                h=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                h=mid-1;
            }
        }

        if(ans[0]==-1){
            return ans;
        }
        l=0;
        h=nums.length-1;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                h=mid-1;
            }
        }
        return ans;
    }
}