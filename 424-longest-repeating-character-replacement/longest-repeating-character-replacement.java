class Solution {
    public int characterReplacement(String s, int k) {
        // int[] freq= new int[26];
        // for(int i=0; i<s.length(); i++){
        //     freq[s.charAt(i)-'A']++;
        // }

        Map<Character,Integer> map = new HashMap<>();
        int left=0, right=0;
        int length=0;
        int maxfreq=0;
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(right)));
            
            if((right-left+1)-maxfreq>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            right++;
            length=Math.max(length,right-left);

            
        }
        return length;
    }
}