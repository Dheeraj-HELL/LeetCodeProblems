class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left =0;
        int right=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int ans=0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            if(map.get(s.charAt(right))>1){
                while(map.get(s.charAt(right))>1){
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
            }
            right++;
            ans=Math.max(ans,right-left);
            
        }
        return ans;
    }
}